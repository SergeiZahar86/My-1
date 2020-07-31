package _Java8._Глава_28_параллелизм._14;
// Простой пример применения класса RecursiveTask<V>
import java.util.concurrent.*;
// Класс RecursiveTask, используемый для вычисления
// суммы значений элементов в массиве типа double
class Sum extends RecursiveTask <Double> {
    // Пороговое значение последовательного выполнения
    final int seqThresHold = 500;
    // Обрабатываемый массив
    double[] data;
    // определить часть обрабатываемых данных
    int start, end;
    Sum (double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }
    // определить сумму значений элементов в массиве типа double
    protected Double compute () {
        double sum = 0;
        // Если количество элементов ниже порогового значения,
        // то выполнить далее обработку последовательно
        if ((end - start) < seqThresHold) {
            // Sum the elements.
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            // В противном случае продолжить разделение данных
            // на меньшие части
            int middle = (start + end) / 2;
            // запустить новые подзадачи на выполнение,
            // используя разделенные на части данные
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);
            // запустить каждую подзадачу путем разветвления
            subTaskA.fork();
            subTaskB.fork();
            // ожидать завершения подзадач и накопить результаты
            sum = subTaskA.join() + subTaskB.join();
        }
        // Return the final sum.
        return sum;
    }
}
// Demonstrate parallel execution.
class RecurTaskDemo {
    public static void main (String[] args) {
        // Create a task pool.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];
        // Initialize nums with values that alternate between
        // positive and negative. инициализировать массив
        // nums чередующимися положительными и
        // отрицательными значениями
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((i % 2) == 0) ? i : -i;
        }
        Sum task = new Sum(nums, 0, nums.length);
        // Запустить задачи типа ForkJoinTask. Обратите
        // внимание на то, что в данном случае метод invoke()
        // возвращает результат
        double summation = fjp.invoke(task);
        System.out.println("Суммирование " + summation);
    }
}


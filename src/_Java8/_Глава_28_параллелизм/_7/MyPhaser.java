package _Java8._Глава_28_параллелизм._7;
// Расширить класс Phaser и переопределить
// метод onAdvance() таким образом, чтобы было
// выполнено только определенное количество фаз
import java.util.concurrent.*;
// Расширить класс MyPhaser, чтобы выполнить
// только определенное количество фаз
class MyPhaser extends Phaser {
    int numPhases;
    MyPhaser (int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }
    // переопределить метод onAdvance(), чтобы
    // выполнить определенное количество фаз
    protected boolean onAdvance (int p, int regParties) {
        // Следующий вызов метода printin() требуется только
        // для целей иллюстрации. Как правило, метод
        // onAdvance() не отображает выводимые данные
        System.out.println("Phase " + p + " completed.\n");
        // возвратить логическое значение true,
        // если все фазы завершены
        if (p == numPhases || regParties == 0) return true;
        // В противном случае возвратить логическое
        // значение false
        return false;
    }
}
class PhaserDemo2 {
    public static void main (String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Starting\n");
        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();
        // ожидать завершения определенного количества фаз
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Синхронизатор фаз завершен");
    }
}
// Поток исполнения, применяющий синхронизатор фаз типа Phaser
class MyThread implements Runnable {
    Phaser phsr;
    String name;
    MyThread (Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }
    public void run () {
        while (!phsr.isTerminated()) {
            System.out.println("Thread " + name +
                    " Beginning Phase " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            // Небольшая пауза, чтобы не нарушить
            // порядок вывода. Это сделано только для
            // демонстрации, но совсем не обязательно для
            // правильного функционирования синхронизатора фаз
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


package _Java8._Глава_28_параллелизм._1;
// A simple semaphore example.
import java.util.concurrent.*;
class SemDemo {
    public static void main (String[] args) {
        Semaphore sem = new Semaphore(1);
        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();
    }
}
// A shared resource.Общий ресурс
class Shared {
    static int count = 0;
}
// A thread of execution that increments count
// .Поток исполнения, увеличивающий значение счетчика на единицу
class IncThread implements Runnable {
    String name;
    Semaphore sem;
    IncThread (Semaphore s, String n) {
        sem = s;
        name = n;
    }
    public void run () {
        System.out.println("Запуск потока " + name);
        try {
            // First, get a permit.сначала получить разрешение
            System.out.println(name + " ожидает разрешения");
            sem.acquire();
            System.out.println(name + " gets a permit." +
                    "получает разрешение");
            // Now, access shared resource.а теперь получить
            // доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                // Now, allow a context switch -- if possible
                // .разрешить, если возможно,
                // переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        // Release the permit.освободить разрешение
        System.out.println(name + " releases the permit." +
                "освобождает разрешение");
        sem.release();
    }
}
// A thread of execution that deccrements count
// .Поток исполнения, уменьшающий значение
// счетчика на единицу
class DecThread implements Runnable {
    String name;
    Semaphore sem;
    DecThread (Semaphore s, String n) {
        sem = s;
        name = n;
    }
    public void run () {
        System.out.println("Starting " + name);
        try {
            // First, get a permit.
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");
            // Now, access shared resource.
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                // Now, allow a context switch -- if possible.
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        // Release the permit.
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}


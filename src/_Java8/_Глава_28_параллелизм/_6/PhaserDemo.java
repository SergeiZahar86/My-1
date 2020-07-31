package _Java8._Глава_28_параллелизм._6;
// An example of Phaser.
import java.util.concurrent.*;
class PhaserDemo {
    public static void main (String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Starting");
        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();
        // Wait for all threads to complete phase one.ожидать
        // завершения всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete" +
                " завершена");
        // Wait for all threads to complete phase two.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");
        // Deregister the main thread.снять основной поток
        // исполнения с регистрации
        phsr.arriveAndDeregister();
        if (phsr.isTerminated()) {
            System.out.println("The Phaser is terminated " +
                    "Синхронизатор фаз завершен");
        }
    }
}
// A thread of execution that uses a Phaser.Поток исполнения,
// применяющий синхронизатор фаз типа Phaser
class MyThread implements Runnable {
    Phaser phsr;
    String name;
    MyThread (Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }
    public void run () {
        System.out.println("Thread " + name + " Beginning Phase One");
        phsr.arriveAndAwaitAdvance(); // Небольшая пауза, чтобы не
        // нарушить порядок вывода.
        // Это сделано только для целей демонстрации, но
        // совсем не обязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " Beginning Phase Two");
        phsr.arriveAndAwaitAdvance(); // Небольшая пауза, чтобы не
        // нарушить порядок вывода.
        // Это сделано только для целей демонстрации, но
        // совсем не обязательно для правильного
        // функционирования синхронизатора фаз
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " Beginning Phase Three");
        phsr.arriveAndDeregister(); // Signal arrival and deregister.
    }
}


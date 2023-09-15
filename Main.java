public class MyThread extends Thread {
    @Override
    public void run() {
        // Код, который будет выполняться внутри потока
        System.out.println("Поток " + Thread.currentThread().getId() + " запущен.");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread();
            thread.start(); // Запускаем поток
        }
    }
}

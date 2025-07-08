package Practice;

public class MultiThreadExample {
    public static void main(String[] args) {
        // 쓰레드 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("🍎 Thread-1 실행 중: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        // 쓰레드 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("🍌 Thread-2 실행 중: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        t1.start(); // Thread-1 시작
        t2.start(); // Thread-2 시작

        System.out.println("💻 main 쓰레드 종료");
    }
}
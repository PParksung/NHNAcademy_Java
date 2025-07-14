package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 17: 인터페이스를 활용한 콜백
interface Callback17 {
    void execute();
}

public class Task17 {
    public void runTask(Callback17 callback) {
        System.out.println("Task started.");
        callback.execute();
        System.out.println("Task completed.");
    }

    public static void main(String[] args) {
        Task17 task = new Task17();

        // TODO: 익명 클래스 또는 람다를 사용하여 Callback을 구현하세요.
        task.runTask(() -> System.out.println("Callback executed."));
    }
} 
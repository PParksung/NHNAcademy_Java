package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 20
public class Outer20 {
    static class Factory20 {
        // TODO: createInstance 메서드를 작성하세요.
        public static Outer20 createInstance() {
            return new Outer20();
        }
    }

    public static void main(String[] args) {
        Outer20 instance = Outer20.Factory20.createInstance();
        System.out.println(instance != null ? "Instance created!" : "Creation failed.");
    }
} 
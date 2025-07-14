package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 3
public class OuterClass3 {
    private String message = "Hello from OuterClass";

    class InnerClass3 {
        // TODO: 외부 클래스의 message를 출력하는 메서드 displayMessage를 작성하세요.
        public void displayMessage() {
            System.out.println("Hello from OuterClass");
        }
    }

    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        OuterClass3.InnerClass3 inner = outer.new InnerClass3();
        inner.displayMessage(); // "Hello from OuterClass" 출력
    }
} 
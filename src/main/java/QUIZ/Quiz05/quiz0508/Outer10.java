package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 10
public class Outer10 {
    private String message = "Hello from Outer";

    class Inner10 {
        public void display() {
            // TODO: 외부 클래스의 message를 출력하세요.
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer10 outer = new Outer10();
        Outer10.Inner10 inner = outer.new Inner10();
        inner.display(); // "Hello from Outer" 출력
    }
} 
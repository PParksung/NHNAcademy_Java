package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 13
public class Outer13 {
    private static String staticMessage = "Static Hello";

    class Inner13 {
        public void display() {
            // TODO: 외부 클래스의 staticMessage를 출력하세요.
            System.out.println(staticMessage);
        }
    }

    public static void main(String[] args) {
        Outer13 outer = new Outer13();
        Outer13.Inner13 inner = outer.new Inner13();
        inner.display(); // "Static Hello" 출력
    }
} 
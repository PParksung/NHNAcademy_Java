package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 1
public class OuterClass1 {
    // TODO: 정적 중첩 클래스 NestedClass1를 작성하고, 메서드 printMessage를 구현하세요.
    static class NestedClass1 {
        public void printMessage() {
            System.out.println("Hello from NestedClass");
        }
    }

    public static void main(String[] args) {
        OuterClass1.NestedClass1 nested = new OuterClass1.NestedClass1();
        nested.printMessage(); // "Hello from NestedClass"
    }
} 
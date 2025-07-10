package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 19
public class Example {
    // TODO: 정적 메서드와 인스턴스 메서드 선언
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // TODO: 두 메서드 호출 및 결과 출력
        Example.staticMethod();
        Example example = new Example();
        example.instanceMethod();
    }
} 
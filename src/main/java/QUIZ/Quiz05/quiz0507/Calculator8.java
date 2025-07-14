package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 8: 인터페이스와 기본 메서드 활용
interface Calculable8 {
    int add(int a, int b);
    default int multiply(int a, int b) {
        // TODO: 곱셈 로직을 추가하세요.
        return a * b;
    }
}

public class Calculator8 implements Calculable8 {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

class Main8 {
    public static void main(String[] args) {
        Calculator8 calculator = new Calculator8();
        System.out.println(calculator.add(5, 10)); // 15 출력
        System.out.println(calculator.multiply(5, 10)); // 50 출력
    }
} 
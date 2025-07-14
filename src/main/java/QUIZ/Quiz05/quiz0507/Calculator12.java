package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 12: 함수형 인터페이스와 람다
@FunctionalInterface
interface Calculator12 {
    int calculate(int a, int b);
}

class Main12 {
    public static void main(String[] args) {
        // TODO: Calculator 인터페이스를 람다로 구현하세요.
        Calculator12 addition = (a, b) -> a + b;
        Calculator12 subtraction = (a, b) -> a - b;
        System.out.println(addition.calculate(10, 5)); // 15 출력
        System.out.println(subtraction.calculate(10, 5)); // 5 출력
    }
}
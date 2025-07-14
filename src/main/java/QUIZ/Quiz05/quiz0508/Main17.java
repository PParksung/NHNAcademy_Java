package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 17
@FunctionalInterface
interface Square17 {
    int calculate(int x);
}

public class Main17 {
    public static void main(String[] args) {
        // TODO: 람다 표현식을 사용하여 Square 구현체를 작성하세요.
        Square17 square = x -> x * x;
        System.out.println(square.calculate(5)); // 25 출력
    }
} 
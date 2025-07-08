package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 1
public class Problem1 {
    public static void main(String[] args) {
        // TODO: Function 인터페이스를 사용하여 람다 표현식을 정의하세요.
        java.util.function.Function<Integer, Integer> square = null;

        // 결과 출력
        System.out.println("5의 제곱: " + square.apply(5)); // 출력: 25
    }
} 
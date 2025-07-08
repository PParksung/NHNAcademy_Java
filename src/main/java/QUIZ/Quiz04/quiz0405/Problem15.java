package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 15
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // TODO: 람다와 스트림 API를 사용하여 짝수 제곱 출력
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println);
    }
} 
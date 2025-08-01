package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 18
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 15, 25, 35, 45);

        // TODO: 람다와 Stream API를 사용하여 10보다 큰 값 필터링
        numbers.stream()
               .filter(n -> n > 10) // TODO: 조건 람다 작성
               .forEach(System.out::println);
    }
} 
package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 9
import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // TODO: 람다와 스트림 API를 사용하여 홀수만 출력
        Arrays.stream(numbers)
            .filter(n -> n % 2 != 0) // TODO: 홀수 필터 조건 작성
            .forEach(System.out::println);
    }
} 
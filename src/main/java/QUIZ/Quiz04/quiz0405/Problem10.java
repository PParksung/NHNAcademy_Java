package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 10
import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        String[] words = {"java", "lambda", "functional"};

        // TODO: 람다와 스트림 API를 사용하여 대문자로 변환
        Arrays.stream(words)
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
} 
package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 5
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // TODO: Consumer 인터페이스를 사용하여 요소를 출력하는 람다 작성
        java.util.function.Consumer<Integer> printElement = null;

        // 리스트 요소 출력
        numbers.forEach(printElement);
    }
} 
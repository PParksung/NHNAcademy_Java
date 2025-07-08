package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 11
import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "grape"};

        // TODO: 람다로 문자열 길이 기준 Comparator 작성
        Arrays.sort(words, null);

        // 결과 출력
        System.out.println(Arrays.toString(words)); // 출력: [kiwi, grape, apple, banana]
    }
} 
package QUIZ.Quiz05.quiz0508;

import java.util.Arrays;
import java.util.Comparator;

// Quiz 5-8 문제 11
public class Main11 {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 4, 1, 5};

        // TODO: 익명 내부 클래스를 사용하여 내림차순 Comparator를 작성하세요.
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(numbers)); // [5, 4, 3, 1, 1] 출력
    }
} 
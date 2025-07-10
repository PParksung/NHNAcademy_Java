package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.5: ArrayProcessor 인터페이스와 람다, counter 함수, main 테스트 코드의 기본 틀입니다.

import QUIZ.Quiz04.quiz0409.ArrayProcessor;

public class Problem5 {
    public static final ArrayProcessor max = array -> {
        double m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > m) m = array[i];
        }
        return m;
    };
    public static final ArrayProcessor min = array -> {
        double m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < m) m = array[i];
        }
        return m;
    };
    public static final ArrayProcessor sum = array -> {
        double s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    };
    public static final ArrayProcessor average = array -> sum.apply(array) / array.length;

    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) count++;
            }
            return count;
        };
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 2, 4, 2};
        System.out.println("최대값: " + max.apply(arr));
        System.out.println("최소값: " + min.apply(arr));
        System.out.println("합계: " + sum.apply(arr));
        System.out.println("평균: " + average.apply(arr));
        System.out.println("2의 개수: " + counter(2).apply(arr));
    }
} 
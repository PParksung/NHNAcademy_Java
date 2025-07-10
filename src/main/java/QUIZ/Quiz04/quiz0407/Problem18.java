package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 18
public class Problem18 {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};

        // TODO: 서브루틴 호출
        int[] minMax = findMinMax(numbers);

        System.out.println("최소값: " + minMax[0]);
        System.out.println("최대값: " + minMax[1]);
    }

    public static int[] findMinMax(int[] array) {
        // TODO: 최소값과 최대값 찾기
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        return new int[]{min, max};
    }
} 
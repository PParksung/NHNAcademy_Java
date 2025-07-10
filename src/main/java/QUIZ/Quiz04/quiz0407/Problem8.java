package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 8
public class Problem8 {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 6};

        // TODO: 서브루틴 호출
        int max = findMax(numbers);

        System.out.println("최대값: " + max);
    }

    /**
     * 배열의 최대값을 반환합니다.
     * @param array 정수 배열
     * @return 배열의 최대값
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
} 
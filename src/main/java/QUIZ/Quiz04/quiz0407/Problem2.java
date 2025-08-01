package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 2
public class Problem2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // TODO: 서브루틴 호출
        boolean sorted = isSorted(numbers);

        System.out.println("배열 정렬 여부: " + sorted);
    }

    /**
     * 배열이 오름차순으로 정렬되었는지 확인합니다.
     * @param array 정수 배열
     * @return 정렬되었으면 true, 아니면 false
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
} 
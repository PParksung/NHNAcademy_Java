package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 20
import java.util.Arrays;

public class Problem20 {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        // TODO: 서브루틴 호출
        int[] merged = mergeSortedArrays(array1, array2);

        // 결과 출력
        System.out.println("병합된 배열: " + Arrays.toString(merged));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length, n2 = array2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < n1) result[k++] = array1[i++];
        while (j < n2) result[k++] = array2[j++];
        return result;
    }
} 
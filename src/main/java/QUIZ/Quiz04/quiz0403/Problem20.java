package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 20
public class Problem20 {
    /**
     * 두 배열의 교집합을 반환합니다.
     * @param arr1 첫 번째 배열
     * @param arr2 두 번째 배열
     * @return 교집합 배열
     */
    public static int[] intersectArrays(int[] arr1, int[] arr2) {
        // TODO: 두 배열의 교집합을 구하여 새 배열 반환
        int[] temp = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0;  j< arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    temp[index] = arr1[i];
                    index++;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result; // TODO: 교집합 배열 반환
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        int[] intersection = intersectArrays(array1, array2);
        System.out.print("교집합 배열: ");
        for (int value : intersection) {
            System.out.print(value + " ");
        }
        // 출력: 교집합 배열: 3 4
    }
} 
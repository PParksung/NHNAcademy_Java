package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 14
public class Problem14 {
    /**
     * 두 배열을 하나로 병합하여 반환합니다.
     * @param arr1 첫 번째 배열
     * @param arr2 두 번째 배열
     * @return 병합된 배열
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO: 두 배열을 병합하여 새 배열 반환
        int[] merge =  new int[arr1.length + arr2.length];
        //arr1.length = 3
        for(int i=0; i<arr1.length; i++){
            merge[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            merge[i+arr1.length] = arr2[i];
        }

        return merge; // TODO: 병합된 배열 반환
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = mergeArrays(array1, array2);
        System.out.print("병합된 배열: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        // 출력: 병합된 배열: 1 2 3 4 5 6
    }
} 
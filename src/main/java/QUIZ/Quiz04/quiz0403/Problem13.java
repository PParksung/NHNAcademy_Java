package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 13
public class Problem13 {
    /**
     * 배열에서 특정 값을 제거한 새 배열을 반환합니다.
     * @param list 정수 배열
     * @param target 제거할 값
     * @return target이 제거된 배열
     */
    public static int[] removeElement(int[] list, int target) {
        // TODO: 배열에서 특정 값(target)을 제거한 새 배열 반환

        int count = 0;
        for(int i=0; i<list.length; i++){
            if(list[i] != target){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for(int i=0; i<list.length; i++){
            if(list[i] != target){
                result[index] = list[i];
                index++;
            }
        }
        return result; // TODO: 수정된 배열 반환
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int[] result = removeElement(numbers, target);
        System.out.print("결과 배열: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        // 출력: 결과 배열: 1 3 4 5
    }
} 
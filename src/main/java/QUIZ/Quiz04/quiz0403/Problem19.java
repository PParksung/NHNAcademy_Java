package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 19
public class Problem19 {
    /**
     * 배열이 오름차순으로 정렬되어 있는지 확인합니다.
     * @param list 정수 배열
     * @return 정렬되었으면 true, 아니면 false
     */
    public static boolean isSorted(int[] list) {
        // TODO: 배열이 오름차순으로 정렬되었는지 확인

        int[] compare = new int[list.length];
        for(int i=0; i<list.length; i++){
            compare[i] = list[i];
        }

        for(int i=0; i<list.length-1; i++){
            for(int j=0; j<list.length-1-i; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        boolean result = true;

        for(int i=0; i<list.length; i++){
            if(compare[i] != list[i]){
                result = false;
            }
        }
        return result;    // TODO: 정렬 여부 반환
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("정렬 여부: " + isSorted(numbers));
        // 출력: 정렬 여부: true
    }
} 
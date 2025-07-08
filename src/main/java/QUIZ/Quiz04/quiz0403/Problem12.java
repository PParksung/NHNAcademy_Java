package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 12
public class Problem12 {
    /**
     * 배열에 특정 값이 포함되어 있는지 확인합니다.
     * @param list 정수 배열
     * @param target 찾고자 하는 값
     * @return target이 배열에 포함되어 있으면 true, 아니면 false
     */
    public static boolean containsValue(int[] list, int target) {
        // TODO: 배열에 특정 값(target)이 포함되어 있는지 확인
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return true;
            }
        }
        return false; // TODO: 포함 여부 반환
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("숫자 " + target + " 포함 여부: " + containsValue(numbers, target));
        // 출력: 숫자 5 포함 여부: true
    }
} 
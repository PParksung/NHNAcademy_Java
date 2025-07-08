package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 11
public class Problem11 {
    /**
     * 배열에서 특정 값의 등장 횟수를 셉니다.
     * @param list 정수 배열
     * @param target 찾고자 하는 값
     * @return target의 등장 횟수
     */
    public static int countOccurrences(int[] list, int target) {
        // TODO: 배열에서 특정 값(target)의 등장 횟수 계산
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                count++;
            }
        }
        return count; // TODO: 등장 횟수 반환
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        System.out.println("숫자 " + target + "의 등장 횟수: " + countOccurrences(numbers, target));
        // 출력: 숫자 2의 등장 횟수: 3
    }
} 
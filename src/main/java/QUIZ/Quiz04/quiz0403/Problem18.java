package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 18
public class Problem18 {
    /**
     * 배열을 오른쪽으로 회전시킵니다.
     * @param list 원래 배열
     * @param k 회전 횟수
     * @return 회전된 배열
     */
    public static int[] rotateArray(int[] list, int k) {
        // TODO: 배열을 오른쪽으로 k번 회전한 새 배열 반환
        return new int[0]; // TODO: 회전된 배열 반환
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;
        int[] rotated = rotateArray(numbers, k);
        System.out.print("회전된 배열: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }
        // 출력: 회전된 배열: 4 5 1 2 3
    }
} 
package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 15
public class Problem15 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: 서브루틴 호출
        int[][] rotated = rotateMatrix(matrix);

        // 결과 출력
        for (int[] row : rotated) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        // TODO: 행렬을 시계 방향으로 90도 회전
        return null; // 임시 반환값
    }
} 
package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 11
public class Problem11 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        // TODO: 서브루틴 호출
        int[][] result = addMatrices(matrix1, matrix2);

        // 결과 출력
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        // TODO: 같은 크기의 두 행렬을 더하기
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
} 
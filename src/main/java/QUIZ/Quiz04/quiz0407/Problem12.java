package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 12

public class Problem12 {

    public static void main(String[] args) {
        Mosaic.open(5, 5, 25, 25);

        // TODO: 임의의 색상으로 채우기
        fillRandomColors();

        // TODO: 평균 색상 계산
        int[] avgColor = calculateAverageColor(0, 0, 4, 4);
        System.out.println("평균 색상: R=" + avgColor[0] + ", G=" + avgColor[1] + ", B=" + avgColor[2]);
    }

    public static int[] calculateAverageColor(int startRow, int startCol, int endRow, int endCol) {
        int rSum = 0, gSum = 0, bSum = 0, count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                rSum += Mosaic.getRed(i, j);
                gSum += Mosaic.getGreen(i, j);
                bSum += Mosaic.getBlue(i, j);
                count++;
            }
        }
        return new int[]{rSum / count, gSum / count, bSum / count};
    }

    public static void fillRandomColors() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);
                Mosaic.setColor(row, col, r, g, b);
            }
        }
    }
} 
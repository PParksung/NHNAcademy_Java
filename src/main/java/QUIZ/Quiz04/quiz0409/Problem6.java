package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.6: 모자이크의 특정 사각형의 녹색 값을 증가시키는 서브루틴과 관련 설정을 포함한 프로그램의 기본 틀입니다.
public class Problem6 {
    // (Mosaic 관련 라이브러리 필요)
    // 행 r, 열 c의 사각형의 녹색 값을 25만큼 증가시키는 서브루틴
    public static void increaseGreen(int r, int c) {
        int g = Mosaic.getGreen(r, c) + 25;
        if (g > 255) g = 255;
        int red = Mosaic.getRed(r, c);
        int blue = Mosaic.getBlue(r, c);
        Mosaic.setColor(r, c, red, g, blue);
    }

    public static void main(String[] args) {
        Mosaic.setUse3DEffect(false);
        Mosaic.open(80, 80, 5, 5);
        // 예시: (40,40) 위치의 녹색 증가
        increaseGreen(40, 40);
    }
} 
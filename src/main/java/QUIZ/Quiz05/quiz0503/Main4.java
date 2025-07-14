package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 4
//import javafx.scene.paint.Color;

public class Main4 {
    public static void main(String[] args) {
        // TODO: Color 객체 생성 및 성분 출력 (JavaFX 미사용, RGB 랜덤값 출력)
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);

        /*
        double r = Math.random();  // 빨강 성분
        double g = Math.random();  // 초록 성분
        double b = Math.random();  // 파랑 성분

        Color randomColor = new Color(r, g, b, 1.0);

        System.out.println("Red: " + randomColor.getRed());
        System.out.println("Green: " + randomColor.getGreen());
        System.out.println("Blue: " + randomColor.getBlue());
         */
    }
}
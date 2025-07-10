package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 4
public class Main4 {
    public static void main(String[] args) {
        // TODO: Color 객체 생성 및 성분 출력 (JavaFX 미사용, RGB 랜덤값 출력)
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
    }
}
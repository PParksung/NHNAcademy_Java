package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 14
public class Problem14 {

    public static void main(String[] args) {
        int[] color1 = {255, 0, 0}; // 빨강
        int[] color2 = {0, 0, 255}; // 파랑

        // TODO: 서브루틴 호출
        int[] mixedColor = combineColors(color1, color2);

        System.out.println("혼합 색상: R=" + mixedColor[0] + ", G=" + mixedColor[1] + ", B=" + mixedColor[2]);
    }

    public static int[] combineColors(int[] color1, int[] color2) {
        // TODO: 두 색상의 평균값 계산
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = (color1[i] + color2[i]) / 2;
        }
        return result;
    }
} 
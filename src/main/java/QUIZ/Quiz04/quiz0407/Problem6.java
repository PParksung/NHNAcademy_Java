package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 6
public class Problem6 {

    public static void main(String[] args) {
        int a = 10, b = 2;

        // TODO: 서브루틴 호출
        int result = divide(a, b);

        System.out.println(a + " / " + b + " = " + result);
    }

    /**
     * 두 정수를 나누어 반환합니다.
     * @param numerator 분자
     * @param denominator 분모
     * @return 나눈 값
     * @throws IllegalArgumentException 분모가 0일 경우 예외 발생
     */
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("분모는 0이 불가능");
        }
        return numerator / denominator;
    }
} 
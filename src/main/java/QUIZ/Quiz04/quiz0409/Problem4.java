package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.4: 목표 숫자가 나올 때까지의 평균 굴림 횟수를 구하는 실험 함수와 표를 출력하는 프로그램의 기본 틀입니다.
public class Problem4 {
    public static double averageRolls(int target) {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += Problem3.rollFor(target);
        }
        return (double)sum / 10000;
    }

    public static void main(String[] args) {
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i <= 12; i++) {
            double avg = averageRolls(i);
            System.out.printf("%7d%22.4f\n", i, avg);
        }
    }
} 
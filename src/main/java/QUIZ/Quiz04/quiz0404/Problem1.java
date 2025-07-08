package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 1
public class Problem1 {
    public static void main(String[] args) {
        // TODO: pythagoras 서브루틴을 호출하여 빗변 계산하기
        Scanner input = new Scanner(System.in);
        System.out.print("직각삼각형 밑변, 높이 입력: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.print("직각삼각형 빗변 길이: " + pythagoras(a, b));
    }

    public static double pythagoras(double x, double y) {
        // TODO: 직각 삼각형의 빗변 길이 계산 후 반환
        double result = Math.sqrt(x * x + y * y);
        return result;
    }
}
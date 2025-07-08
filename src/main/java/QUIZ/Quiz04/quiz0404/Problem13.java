package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 13
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double a = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력하세요: ");
        double b = sc.nextDouble();
        double avg = calculateAverage(a, b);
        System.out.println(a + "와 " + b + "의 평균: " + avg);
    }

    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
    }
} 
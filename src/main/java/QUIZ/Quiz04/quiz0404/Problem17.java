package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 17
public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("밑수를 입력하세요: ");
        double base = sc.nextDouble();
        System.out.print("지수를 입력하세요: ");
        int exponent = sc.nextInt();
        double result = power(base, exponent);
        System.out.println(base + "의 " + exponent + "제곱: " + result);
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for(int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
} 
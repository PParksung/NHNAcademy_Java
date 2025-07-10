package QUIZ.Quiz04.quiz0410;

import java.util.Scanner;

// Quiz 4-10 문제 12
public class Q12 {
    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    public static void main(String[] args) {
        System.out.print("3개의 숫자 입력: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print("제일 작은 숫자 : " +min3(num1, num2, num3));
    }
} 
package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 19
public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        int max = maxValue(a, b);
        System.out.println(a + "와 " + b + " 중 더 큰 값: " + max);
    }

    public static int maxValue(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
} 
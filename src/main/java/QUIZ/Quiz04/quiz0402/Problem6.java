package QUIZ.Quiz04.quiz0402;

import java.util.Scanner;

// Quiz 4-2 문제 6
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addNumbers(a, b);
        System.out.println("합: " + sum);
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
} 
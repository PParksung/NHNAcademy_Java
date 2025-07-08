package QUIZ.Quiz04.quiz0402;

import java.util.Scanner;

// Quiz 4-2 문제 9
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        System.out.printf("Factorial(%d) = %d\n", n, factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
} 
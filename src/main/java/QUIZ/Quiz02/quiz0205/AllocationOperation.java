package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 9
public class AllocationOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("원래 a 값: " + a);
        a += b;
        System.out.println("a += b: " + a);
        a -= b;
        System.out.println("a -= b: " + a);
        a *= b;
        System.out.println("a *= b: " + a);
        a /= b;
        System.out.println("a /= b: " + a);
    }
}

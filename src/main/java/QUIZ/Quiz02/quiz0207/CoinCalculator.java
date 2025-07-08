package QUIZ.Quiz02.quiz0207;

import java.util.Scanner;

//Quiz 2-7 문제 4
public class CoinCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("쿼터 개수: ");
        int quarters = sc.nextInt();
        System.out.print("다임 개수: ");
        int dimes = sc.nextInt();
        System.out.print("니켈 개수: ");
        int nickels = sc.nextInt();
        System.out.print("페니 개수: ");
        int pennies = sc.nextInt();

        double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;
        System.out.printf("총 금액: $%.2f\n", total);
    }
}

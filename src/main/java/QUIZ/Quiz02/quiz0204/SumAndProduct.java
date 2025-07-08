package QUIZ.Quiz02.quiz0204;

import java.util.Scanner;

//Quiz 2-4 문제 4
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
        // TODO: 두 수를 입력 받습니다.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // TODO: 두 수의 합을 출력합니다.
        int sum = num1 + num2;
        System.out.println(sum);
        // TODO: 두 수의 곱을 출력합니다.
        int product = num1 * num2;
        System.out.println(product);

        scanner.close();
    }
}

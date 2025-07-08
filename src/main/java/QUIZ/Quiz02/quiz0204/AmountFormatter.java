package QUIZ.Quiz02.quiz0204;

import java.util.Scanner;

//Quiz 2-4 문제 2
public class AmountFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        // TODO: 금액을 실수로 입력 받습니다.
        float account = scanner.nextFloat();

        // TODO: 쉼표와 소수점 둘째 자리까지만 출력합니다.
        System.out.printf("입력된 금액은: $%.2f", account);
        scanner.close();
    }
}

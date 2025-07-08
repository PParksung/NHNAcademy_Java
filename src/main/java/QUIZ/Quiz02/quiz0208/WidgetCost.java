//Quiz 2-8 문제 14

package QUIZ.Quiz02.quiz0208;

import java.util.Scanner;

public class WidgetCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("위젯 수량을 입력하세요: ");
        int count = scanner.nextInt();

        System.out.print("위젯 1개 가격을 입력하세요: ");
        double price = scanner.nextDouble();

        double total = count * price;

        System.out.printf("총 비용: %.2f%n", total);

        scanner.close();
    }
}

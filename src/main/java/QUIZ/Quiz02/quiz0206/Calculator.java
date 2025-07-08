package QUIZ.Quiz02.quiz0206;

// Quiz 2-6 문제 5
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("합: " + sum);
    }
}
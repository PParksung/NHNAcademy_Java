package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 9
public class OddEvenSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("짝수입니다.");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
        }
    }
} 
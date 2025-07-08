package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 11
public class LotteryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("복권 번호를 입력하세요(3자리): ");
        String number = scanner.nextLine();

        switch (number) {
            case "777":
                System.out.println("1등 당첨");
                break;
            case "555":
                System.out.println("2등 당첨");
                break;
            case "123":
                System.out.println("3등 당첨");
                break;
            default:
                System.out.println("꽝");
        }
    }
} 
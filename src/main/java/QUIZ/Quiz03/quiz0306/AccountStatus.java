package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 7
public class AccountStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌 상태를 입력하세요(ACTIVE, INACTIVE, CLOSED): ");
        String status = scanner.nextLine();

        switch (status) {
            case "ACTIVE":
                System.out.println("정상적으로 운영 중입니다.");
                break;
            case "INACTIVE":
                System.out.println("비활성 상태입니다.");
                break;
            case "CLOSED":
                System.out.println("계좌가 닫혔습니다.");
                break;
            default:
                System.out.println("알 수 없는 상태입니다.");
        }
    }
} 
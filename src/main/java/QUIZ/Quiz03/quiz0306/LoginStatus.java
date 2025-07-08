package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 10
public class LoginStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("사용자 상태를 입력하세요(LOGGED_IN, LOGGED_OUT, BLOCKED): ");
        String status = scanner.nextLine();

        switch (status) {
            case "LOGGED_IN":
                System.out.println("사용자가 로그인했습니다.");
                break;
            case "LOGGED_OUT":
                System.out.println("사용자가 로그아웃했습니다.");
                break;
            case "BLOCKED":
                System.out.println("사용자가 차단되었습니다.");
                break;
            default:
                System.out.println("알 수 없는 상태입니다.");
        }
    }
} 
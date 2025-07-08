package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 17
public class LoginAttempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "pass123";
        String inputPassword;
        
        do {
            System.out.print("비밀번호를 입력하세요: ");
            inputPassword = sc.nextLine();
        } while(!inputPassword.equals(correctPassword));
        
        System.out.println("로그인 성공!");
    }
} 
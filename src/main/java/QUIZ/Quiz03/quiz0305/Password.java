package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 18
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("패스워드를 입력하세요: ");
        String password = sc.nextLine();
        
        if(password.equals("1234")) {
            System.out.println("패스워드가 맞습니다.");
        } else {
            System.out.println("패스워드가 틀렸습니다.");
        }
    }
} 
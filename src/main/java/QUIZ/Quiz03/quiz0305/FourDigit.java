package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 16
public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        if(num >= 1000 && num <= 9999) {
            System.out.println("네 자리 수입니다.");
        } else {
            System.out.println("네 자리 수가 아닙니다.");
        }
    }
} 
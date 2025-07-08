package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 3
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        if(num > 0) {
            System.out.println("양수입니다.");
        } else if(num < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
} 
package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 10
public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a % b == 0) {
            System.out.println(a + "은 " + b + "의 배수입니다.");
        } else {
            System.out.println(a + "은 " + b + "의 배수가 아닙니다.");
        }
    }
} 
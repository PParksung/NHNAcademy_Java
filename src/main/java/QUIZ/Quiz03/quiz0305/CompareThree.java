package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 2
public class CompareThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a > b && a > c) {
            System.out.println("가장 큰 값: " + a);
        } else if(b > a && b > c) {
            System.out.println("가장 큰 값: " + b);
        } else {
            System.out.println("가장 큰 값: " + c);
        }
    }
} 
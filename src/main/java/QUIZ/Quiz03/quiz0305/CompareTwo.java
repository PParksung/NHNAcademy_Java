package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 1
public class CompareTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b) {
            System.out.println("큰 값: " + a);
        } else {
            System.out.println("큰 값: " + b);
        }
    }
} 
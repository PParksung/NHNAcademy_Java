package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 14
public class SmallerValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a < b) {
            System.out.println("작은 값: " + a);
        } else {
            System.out.println("작은 값: " + b);
        }
    }
} 
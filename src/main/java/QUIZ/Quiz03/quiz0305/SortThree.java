package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 7
public class SortThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 숫자를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int temp;
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
} 
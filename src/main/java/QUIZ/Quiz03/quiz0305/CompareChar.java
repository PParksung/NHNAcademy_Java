package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 8
public class CompareChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 문자를 입력하세요: ");
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        if(ch1 <= ch2) {
            System.out.println(ch1 + " " + ch2);
        } else {
            System.out.println(ch2 + " " + ch1);
        }
    }
} 
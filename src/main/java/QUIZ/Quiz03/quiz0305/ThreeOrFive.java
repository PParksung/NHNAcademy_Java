package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 13
public class ThreeOrFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        if(num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + "은 3 또는 5의 배수입니다.");
        } else {
            System.out.println(num + "은 3 또는 5의 배수가 아닙니다.");
        }
    }
} 
package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 15
public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        
        if(num >= 1 && num <= 50) {
            System.out.println(num + "는 범위 안에 있습니다.");
        } else {
            System.out.println(num + "는 범위 밖에 있습니다.");
        }
    }
} 
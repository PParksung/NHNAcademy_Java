package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 11
public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        if(num >= 1 && num <= 100) {
            System.out.println(num + "은 범위 안에 있습니다.");
        } else {
            System.out.println(num + "은 범위 밖에 있습니다.");
        }
    }
} 
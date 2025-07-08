package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 17
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();
        
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("윤년입니다.");
                } else {
                    System.out.println("윤년이 아닙니다.");
                }
            } else {
                System.out.println("윤년입니다.");
            }
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
} 
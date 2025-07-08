package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 8
public class StringNumConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열로 숫자를 입력하세요: ");
        String num = sc.next();
        System.out.println("정수 값: " + Integer.parseInt(num));
        System.out.println("실수 값: " + Double.parseDouble(num));
    }
}

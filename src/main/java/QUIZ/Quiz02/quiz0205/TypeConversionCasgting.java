package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 7
public class TypeConversionCasgting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("실수를 입력하세요: ");
        double num = sc.nextDouble();
        System.out.println("정수로 타입 변환된 값: " + (int)num);
    }
}

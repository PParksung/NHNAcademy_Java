package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 4
public class RelationOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int second = sc.nextInt();

        System.out.println("첫 번째 값이 두 번째 값보다 큰가? " + (first>second));
        System.out.println("첫 번째 값이 두 번째 값보다 작은가? " + (first<second));
        System.out.println("두 값이 같은가? " + (first==second));
    }
}

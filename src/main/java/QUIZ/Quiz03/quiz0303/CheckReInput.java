package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 5
public class CheckReInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int sum = 0;
        do {
            System.out.print("숫자 입력: ");
            int num = sc.nextInt();
            sum += num;
            System.out.print("다시 입력하시겠습니까? ");
            input =  sc.next();
        }while(input.equals("yes"));
        System.out.print("합: " + sum);
    }
}

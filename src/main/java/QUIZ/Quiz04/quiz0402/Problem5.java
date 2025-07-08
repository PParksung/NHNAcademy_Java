package QUIZ.Quiz04.quiz0402;

import java.util.Scanner;

// Quiz 4-2 문제 5
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("숫자 입력: ");
        checkNumber(sc.nextInt());
    }

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + "은(는) 0보다 큽니다.");
        } else if (num < 0) {
            System.out.println(num + "은(는) 0보다 작습니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
} 
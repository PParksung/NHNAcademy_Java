package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 2
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월(1~12)을 입력하세요: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28 또는 29일");
                break;
            default:
                System.out.println("잘못된 월입니다.");
        }
    }
} 
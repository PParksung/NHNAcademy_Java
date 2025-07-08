package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 3
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("학점: A");
                break;
            case 8:
                System.out.println("학점: B");
                break;
            case 7:
                System.out.println("학점: C");
                break;
            case 6:
                System.out.println("학점: D");
                break;
            default:
                System.out.println("학점: F");
        }
    }
} 
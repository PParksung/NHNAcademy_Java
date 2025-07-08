package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 10
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        char grade = getGrade(score);
        System.out.println("점수: " + score + ", 학점: " + grade);
    }

    public static char getGrade(int score) {
        // 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 그 외 F
        if(score >= 90) {
            return 'A';
        } else if(score >= 80) {
            return 'B';
        } else if(score >= 70) {
            return 'C';
        } else if(score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


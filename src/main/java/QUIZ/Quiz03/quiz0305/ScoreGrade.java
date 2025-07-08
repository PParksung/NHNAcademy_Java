package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 12
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        
        if(score >= 90) {
            System.out.println("등급: 우수");
        } else if(score >= 70) {
            System.out.println("등급: 보통");
        } else {
            System.out.println("등급: 미흡");
        }
    }
} 
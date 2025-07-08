package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 5
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        
        if(score >= 90) {
            System.out.println("성적: A");
        } else if(score >= 80) {
            System.out.println("성적: B");
        } else if(score >= 70) {
            System.out.println("성적: C");
        } else if(score >= 60) {
            System.out.println("성적: D");
        } else {
            System.out.println("성적: F");
        }
    }
} 
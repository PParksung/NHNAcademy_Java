package QUIZ.Quiz02.quiz0207;

import java.io.File;
import java.util.Scanner;

//Quiz 2-7 문제 7
public class StudentScores {
    public static void main(String[] args) throws Exception {
        File file = new File("testdata.txt");
        Scanner sc = new Scanner(file);

        String name = sc.nextLine();

        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("학생 이름: " + name);
        System.out.printf("시험 평균: %.2f%n", average);
    }
}

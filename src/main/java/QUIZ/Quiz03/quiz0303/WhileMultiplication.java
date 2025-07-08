package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 11
public class WhileMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dan = 2;
        while(dan <= 9) {
            int i = 1;
            while(i <= 9) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
                i++;
            }
            dan++;
        }
    }
} 
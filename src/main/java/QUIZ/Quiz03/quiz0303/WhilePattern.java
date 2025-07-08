package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 15
public class WhilePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while(i <= 4) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
} 
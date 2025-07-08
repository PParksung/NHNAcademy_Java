package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 17
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
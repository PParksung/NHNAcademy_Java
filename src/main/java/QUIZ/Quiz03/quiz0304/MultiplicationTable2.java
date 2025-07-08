package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 15
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("단 입력: ");
        int dan = sc.nextInt();
        
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }
} 
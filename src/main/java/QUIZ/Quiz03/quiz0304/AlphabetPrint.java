package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 9
public class AlphabetPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(char c = 'A'; c <= 'Z'; c++){
            System.out.print(c + " ");
        }
    }
} 
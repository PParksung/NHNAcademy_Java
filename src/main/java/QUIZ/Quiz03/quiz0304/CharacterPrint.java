package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 8
public class CharacterPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
} 
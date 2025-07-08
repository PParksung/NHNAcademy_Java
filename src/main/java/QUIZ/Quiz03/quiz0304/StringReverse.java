package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 18
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        String reversed = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("뒤집힌 문자열: " + reversed);
    }
} 
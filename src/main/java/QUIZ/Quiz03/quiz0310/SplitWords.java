package QUIZ.Quiz03.quiz0310;

import java.util.Scanner;

// Quiz 3-10 문제 4번
public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문장을 입력하세요: ");
        String line = sc.nextLine();
        
        String word = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            if (Character.isLetter(ch)) {
                word += ch;
            } else {
                if (word.length() > 0) {
                    System.out.println(word);
                    word = "";
                }
            }
        }
        
        if (word.length() > 0) {
            System.out.println(word);
        }
    }
} 
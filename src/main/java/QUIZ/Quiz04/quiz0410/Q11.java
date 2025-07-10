package QUIZ.Quiz04.quiz0410;

import java.util.Scanner;

// Quiz 4-10 문제 11
public class Q11 {
    public static int countChars(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("문자열 입력: ");
        Scanner sc = new Scanner(System.in);
        String input =  sc.nextLine();
        System.out.print("찾을 문자 입력: ");
        String find =  sc.nextLine();
        System.out.printf("%d번 나옴", countChars(input, find.charAt(0)));
    }
} 
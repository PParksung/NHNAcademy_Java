package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 1: ");
        String str1 = sc.nextLine();
        System.out.print("문자열 2: ");
        String str2 = sc.nextLine();

        System.out.print("공통 문자: ");
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            boolean check = false;

            for (int k = 0; k < i; k++) {
                if (str2.charAt(k) == ch) {
                    check = true;
                    break;
                }
            }
            if (check) continue;

            if (str1.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}

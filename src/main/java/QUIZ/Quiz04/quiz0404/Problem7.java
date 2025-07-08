package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 7
public class Problem7 {
    public static void main(String[] args) {
        // TODO: isPalindrome 서브루틴을 호출하여 문자열이 팰린드롬인지 확인
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = sc.nextLine();
        if(isPalindrome(input)) {
            System.out.print("팰린드롬이다");
        }else{
            System.out.print("팰린드롬이 아니다");
        }
    }

    public static boolean isPalindrome(String str) {
        // TODO: 문자열이 팰린드롬인지 여부 반환
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
package QUIZ.Quiz02.quiz0203;

import java.util.Scanner;

//Quiz 2-3 문제 4
public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열을 입력 받습니다.(앞 문제 참조)
        String input = scanner.nextLine();
        // TODO: 문자열을 모든 문자를 대문자로 변환하세요.
        String upperCase = input.toUpperCase();
        // TODO: 문자열의 모든 문자를 소문자로 변환하세요.
        String lowerCase = input.toLowerCase();

        System.out.println("대문자: " + upperCase);
        System.out.println("소문자: " + lowerCase);

        scanner.close();
    }
}

package QUIZ.Quiz02.quiz0204;

import java.util.Scanner;

//Quiz 2-4 문제 3
public class TextPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열을 한줄 입력받습니다.
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            // TODO: 문자열에서 해당 위치의 문자를 얻어와 출력합니다.
            char ch = input.charAt(i);
            System.out.println(ch);
        }

        scanner.close();
    }
}

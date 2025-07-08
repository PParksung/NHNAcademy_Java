package QUIZ.Quiz02.quiz0203;

import java.util.Scanner;

//Quiz 2-3 문제 9
public class StringToSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문장을 입력하세요: ");
        String line =  scanner.nextLine();

        System.out.print("시작 위치를 입력하세요: ");
        int start = scanner.nextInt();

        System.out.print("끝 위치를 입력하세요: ");
        int end = scanner.nextInt();

        String substring = line.substring(start, end);
        System.out.print("부분 문자열: " + substring);
    }
}

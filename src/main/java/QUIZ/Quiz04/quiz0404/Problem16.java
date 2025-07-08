package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 16
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월(숫자)을 입력하세요: ");
        int month = sc.nextInt();
        String season = getSeason(month);
        System.out.println(month + "월의 계절: " + season);
    }

    public static String getSeason(int month) {
        String result;
        switch(month) {
            case 12: case 1: case 2:
                result = "겨울";
                break;
            case 3: case 4: case 5:
                result = "봄";
                break;
            case 6: case 7: case 8:
                result = "여름";
                break;
            case 9: case 10: case 11:
                result = "가을";
                break;
            default:
                result = "잘못된 월";
        }
        return result;
    }
} 
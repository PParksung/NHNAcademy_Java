package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 3
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        String input = sc.nextLine(); //12345
        int count = input.length(); // 5
        String result = "";

        while(count > 0){
            result += input.charAt(count-1);
            count--;
        }

        System.out.println("뒤집힌 숫자: " + result);
    }
}

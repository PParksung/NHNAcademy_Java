package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 14
public class ContinueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 (종료: 'end'): ");
        
        while(true) {
            String str = sc.next();
            if(str.equals("end")) {
                break;
            }
            if(str.length() > 3) {
                continue;
            }
            System.out.println("짧은 문자열: " + str);
        }
    }
} 
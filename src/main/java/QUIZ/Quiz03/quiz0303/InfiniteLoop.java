package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 10
public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("입력: ");
            String input = sc.nextLine();
            
            if(input.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            
            System.out.println("입력한 값: " + input);
        }
    }
} 
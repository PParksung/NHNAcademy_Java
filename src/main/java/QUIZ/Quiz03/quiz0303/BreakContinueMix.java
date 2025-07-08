package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 19
public class BreakContinueMix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int value = scanner.nextInt();
            
            if(value == 0) {
                break;
            }
            if(value % 2 != 0) {
                continue;
            }
            System.out.println(value);
        }
    }
} 
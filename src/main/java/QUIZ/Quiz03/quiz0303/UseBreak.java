package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 6
public class UseBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        System.out.print("숫자를 입력하세요 (음수를 입력하면 종료): ");
        while(num > 0){
            num = sc.nextInt();
            if(num < 0){
                break;
            }
            else{
                sum+=num;
            }
        }
        System.out.println("합: " + sum);
    }
}

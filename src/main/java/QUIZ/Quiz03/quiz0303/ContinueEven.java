package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 7
public class ContinueEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
        int n = 1;
        String result = "";
        while(n!=0){
            n = sc.nextInt();

            if(n%2==0){
                if(n==0){
                    continue;
                }
                result += n + " ";
            }
        }
        System.out.print("짝수: " + result);
    }
}

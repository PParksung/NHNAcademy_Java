package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 13
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요(공백으로 구분): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a;
        int min = b;
        int remainder = 0;
        int result = 0;

        if(a<b){
            max = b;
            min = a;
        }
        //System.out.print("max : " + max + " min : " + min);
        while(true) {
            remainder = max % min;
            //System.out.print("remainder: " + remainder);
            if(remainder == 0){
                result = min;
                break;
            }
            max = min; // max = 12
            min = remainder; //min = 6
        }

        System.out.print("최대공약수: " + result);
    }
}

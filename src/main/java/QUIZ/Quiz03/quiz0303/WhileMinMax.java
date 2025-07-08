package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 2
public class WhileMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            int a = sc.nextInt(); //15

            if(a==0){
                break;
            }

            if(first == true){
                min = a; //min = 15
                max = a; //max =15
                first = false;
            }else{
                if(a < min){ //
                    min = a;
                }
                else if(a > max){
                    max = a;
                }
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}

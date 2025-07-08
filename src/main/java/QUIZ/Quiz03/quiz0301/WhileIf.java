package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 7
public class WhileIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            else if(a%2== 0){
                System.out.println(a);
            }
            else{

            }
        }
    }
}

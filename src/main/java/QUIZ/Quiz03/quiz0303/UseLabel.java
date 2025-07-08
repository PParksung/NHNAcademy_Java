package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 8
public class UseLabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 1: ");
        String str1 = sc.nextLine();
        System.out.print("문자열 2: ");
        String str2 = sc.nextLine();
        String result = "";

        outer:
        while(true){
            for(int i = 0; i < str1.length(); i++){
                for(int j = 0; j < str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        result = result + str1.charAt(j);
                        break outer;
                    }
                }
            }
        }
        System.out.print("공통 문자: " + result);
    }
}

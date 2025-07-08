package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 10
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        System.out.print("문자 입력: ");
        char ch = sc.next().charAt(0);
        
        boolean found = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("포함되어 있습니다.");
        } else {
            System.out.println("포함되어 있지 않습니다.");
        }
    }
} 
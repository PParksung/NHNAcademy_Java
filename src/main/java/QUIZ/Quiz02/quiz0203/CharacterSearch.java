package QUIZ.Quiz02.quiz0203;

import java.util.Scanner;

//Quiz 2-3 문제 5
public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열 한줄을 입력 받습니다.
        String line = scanner.nextLine();

        System.out.print("검색할 문자를 입력하세요: ");
        // TODO: 검색할 문자를 입력 받습니다.
        char target = scanner.next().charAt(0);
        //System.out.println("target : " + target);
        // TODO: 문자열에서 주어진 문자를 찾습니다.
        int position = 0;
        for (int i = 0; i < line.length(); i++) {
            if(target == line.charAt(i)) {
                position = i;
                break;
                //System.out.println("positoin : " + position);
            }
            else{
                position = -1;
            }
        }

        if (position != -1) {
            System.out.println("문자 '" + target + "'의 위치: " + position);
        } else {
            System.out.println("문자 '" + target + "'는 문자열에 없습니다.");
        }

        scanner.close();
    }
}


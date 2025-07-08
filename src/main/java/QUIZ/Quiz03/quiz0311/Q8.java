package QUIZ.Quiz03.quiz0311;

import QUIZ.textio.TextIO;

// Quiz 3-11 문제 8
public class Q8 {
    public static void main(String[] args) {

        System.out.print("정수를 입력하세요: ");
        int n = TextIO.getInt();
    
        if (n % 2 == 0) {
            System.out.println(n + "은(는) 짝수입니다.");
        } else {
            System.out.println(n + "은(는) 홀수입니다.");
        }
    
    }
}
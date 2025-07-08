package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 9
public class Problem9 {
    public static void main(String[] args) {
        // TODO: divideNumbers 서브루틴을 호출하여 나누기 계산
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        try{
            double result = divideNumbers(num1, num2);
            System.out.print("나누기 결과: " + result);
        }catch(ArithmeticException e){
            System.out.print(e.getMessage());
        }
    }

    public static double divideNumbers(double a, double b) {
        // TODO: 두 숫자를 나누고, 예외 발생 시 오류 메시지 반환
        if(b == 0){
            throw new  ArithmeticException();
        }
        return a / b;
    }
}
package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 4
public class Problem4 {
    public static void main(String[] args) {
        // TODO: isPrime 서브루틴을 호출하여 주어진 숫자가 소수인지 확인
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();
        String result = "";
        if(isPrime(n)){
            result = "소수임";
        }else{
            result = "소수가 아님";
        }
        System.out.print(result);

    }

    public static boolean isPrime(int number) {
        // TODO: 숫자가 소수인지 여부를 반환
        for (int i = 2; i <number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
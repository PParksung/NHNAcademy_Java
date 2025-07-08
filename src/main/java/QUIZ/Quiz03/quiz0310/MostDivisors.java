package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 2번
public class MostDivisors {
    public static void main(String[] args) {
        int maxDivisors = 0;
        int maxNumber = 0;

        for (int n = 1; n <= 10000; n++) {
            int divisors = 0;
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    divisors = divisors + 1;
                }
            }
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                maxNumber = n;
            }
        }

        System.out.println("1부터 10000 사이에서");
        System.out.println("가장 많은 약수를 가진 수는 " + maxNumber + "입니다.");
        System.out.println("약수의 개수: " + maxDivisors);
    }
} 
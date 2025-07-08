package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 6번
public class AllMostDivisors {
    public static void main(String[] args) {
        int[] divisorCounts = new int[10001];
        int maxDivisors = 0;

        for (int n = 1; n <= 10000; n++) {
            int divisors = 0;
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    divisors = divisors + 1;
                }
            }
            divisorCounts[n] = divisors;
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
            }
        }

        System.out.println("1부터 10000 사이에서");
        System.out.println("가장 많은 약수의 개수는 " + maxDivisors + "개입니다.");
        System.out.println("해당하는 수들:");

        for (int n = 1; n <= 10000; n++) {
            if (divisorCounts[n] == maxDivisors) {
                System.out.println("   " + n);
            }
        }
    }
} 
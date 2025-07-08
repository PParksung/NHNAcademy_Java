package QUIZ.Quiz03.quiz0304;

// Quiz 3-4 문제 4
public class SumCalculation {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("합: " + sum);
    }
} 
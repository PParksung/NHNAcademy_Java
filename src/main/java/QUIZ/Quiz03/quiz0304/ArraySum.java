package QUIZ.Quiz03.quiz0304;

// Quiz 3-4 문제 16
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 5};
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("합: " + sum);
    }
} 
package QUIZ.Quiz03.quiz0311;

// Quiz 3-11 문제 14
public class Q14 {
    public static void main(String[] args) {
        int count = 0;
        int[] numbers = { 1,2,3,4,5,42,6,42,7,42 };
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 42){
                count++;
            }
        }
        System.out.println("42의 개수: " + count);
    }
}
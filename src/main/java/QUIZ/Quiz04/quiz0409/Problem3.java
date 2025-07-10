package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.3
public class Problem3 {
    public static int rollFor(int target) {
        if (target < 2 || target > 12) {
            throw new IllegalArgumentException("2~12 사이의 값만 허용");
        }
        int count = 0;
        java.util.Random rand = new java.util.Random();
        while (true) {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            count++;
            if (d1 + d2 == target) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int rolls = rollFor(2);
        System.out.println(rolls);
    }
} 
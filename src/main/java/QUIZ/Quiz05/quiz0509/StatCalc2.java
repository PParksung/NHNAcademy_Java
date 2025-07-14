package QUIZ.Quiz05.quiz0509;

// 5.2 연습문제: StatCalc 클래스 개선 및 테스트
import java.util.Scanner;

public class StatCalc2 {
    // TODO: getMax(), getMin() 메서드를 추가하세요.
    private int count;
    private double sum;
    private double squareSum;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        if (num > max) max = num;
        if (num < min) min = num;
    }
    public int getCount() {
        return count;
    }
    public double getSum() {
        return sum;
    }
    public double getMean() {
        return sum / count;
    }
    public double getStandardDeviation() {
        return Math.sqrt((squareSum - sum * sum / count) / (count - 1));
    }
    public double getMax() {
        return max;
    }
    public double getMin() {
        return min;
    }

    public static void main(String[] args) {
        StatCalc2 calc = new StatCalc2();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
        while (true) {
            double num = sc.nextDouble();
            if (num == 0) break;
            calc.enter(num);
        }
        System.out.println("입력 개수: " + calc.getCount());
        System.out.println("합계: " + calc.getSum());
        System.out.println("평균: " + calc.getMean());
        System.out.println("표준편차: " + calc.getStandardDeviation());
        System.out.println("최대값: " + calc.getMax());
        System.out.println("최소값: " + calc.getMin());
    }
}
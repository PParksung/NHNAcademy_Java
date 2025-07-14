package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 2
public class Calculator2 {
    private int result;

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        // TODO: this를 사용하여 add 메서드를 호출하여 값을 빼는 동작을 구현하세요.
        this.add(-value);
    }

    public void displayResult() {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        calc.add(10);
        calc.subtract(5);
        calc.displayResult(); // Result: 5 출력
    }
} 
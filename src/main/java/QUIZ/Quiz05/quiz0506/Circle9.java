package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 9
public class Circle9 {
    private int radius;

    public Circle9() {
        this(1); // TODO: 기본 반지름 설정
    }

    public Circle9(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle9 circle = new Circle9();
        System.out.println("Area: " + circle.calculateArea()); // Area: 3.14 출력
    }
} 
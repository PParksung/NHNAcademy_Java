package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 6
public class Rectangle6 {
    private int width;
    private int height;

    public Rectangle6() {
        this(1, 1); // TODO: this를 사용하여 기본 크기 설정
    }

    public Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle6 rect = new Rectangle6();
        System.out.println("Area: " + rect.calculateArea()); // Area: 1 출력
    }
} 
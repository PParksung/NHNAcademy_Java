package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 17
public class Rectangle2 {
    int width;
    int height;

    // TODO: 복사 생성자 작성
    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle2(Rectangle2 other) {
        this.width = other.width;
        this.height = other.height;
    }

    public static void main(String[] args) {
        // TODO: Rectangle 객체 복사 및 데이터 출력
        Rectangle2 r1 = new Rectangle2(10, 5);
        Rectangle2 r2 = new Rectangle2(r1);
        System.out.println("r1: " + r1.width + ", " + r1.height);
        System.out.println("r2: " + r2.width + ", " + r2.height);
    }
} 
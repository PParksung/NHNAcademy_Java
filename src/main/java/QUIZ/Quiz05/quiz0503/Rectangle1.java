package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 6
public class Rectangle1 {
    int width;
    int height;

    // TODO: toString 메서드 재정의
    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }

    public static void main(String[] args) {
        // TODO: Rectangle 객체 생성 및 출력
        Rectangle1 rect = new Rectangle1();
        rect.width = 10;
        rect.height = 5;
        System.out.println(rect);
    }
} 
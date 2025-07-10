package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 9
public class Rectangle {
    int width;
    int height;

    // TODO: 기본 생성자 작성
    // TODO: 매개변수 생성자 작성
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        // TODO: Rectangle 객체 두 개 생성 및 출력
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(5, 5);
        System.out.println(rectangle1.height*rectangle1.width);
        System.out.println(rectangle2.height*rectangle2.width);
    }
} 
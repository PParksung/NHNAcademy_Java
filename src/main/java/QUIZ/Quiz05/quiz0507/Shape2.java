package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 2
public interface Shape2 {
    // TODO: getArea() 메서드를 정의하세요.
    int getArea();
}

interface Drawable2 extends Shape2 {
    // TODO: draw() 메서드를 추가로 정의하세요.
    void draw();
}

class Rectangle2 implements Drawable2 {
    private int width, height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        // TODO: 넓이를 계산하여 반환하세요.
        return width * height;
    }

    @Override
    public void draw() {
        // TODO: 사각형을 그리는 메서드를 구현하세요.
        System.out.println("Drawing a Rectangle");
    }
}

class Main2 {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2(5, 10);
        rectangle.draw(); // "Drawing a Rectangle" 출력
        System.out.println(rectangle.getArea()); // 50 출력
    }
} 
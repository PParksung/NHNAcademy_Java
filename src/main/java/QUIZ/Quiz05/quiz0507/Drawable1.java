package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 1
public interface Drawable1 {
    // TODO: draw() 메서드를 정의하세요.
    void draw();
}

class Circle1 implements Drawable1 {
    // TODO: Circle 클래스의 draw() 메서드를 구현하세요.
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square1 implements Drawable1 {
    // TODO: Square 클래스의 draw() 메서드를 구현하세요.
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Main1 {
    public static void main(String[] args) {
        Drawable1 circle = new Circle1();
        Drawable1 square = new Square1();
        circle.draw(); // "Drawing a Circle" 출력
        square.draw(); // "Drawing a Square" 출력
    }
} 
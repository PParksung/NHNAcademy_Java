package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 7
public class Circle1 {
    int radius;
    int x, y;

    // TODO: draw 메서드 작성
    public void draw() {
        System.out.println("radius=" + radius + ", x=" + x + ", y=" + y);
    }

    public static void main(String[] args) {
        // TODO: Circle 객체 생성 및 출력
        Circle1 c = new Circle1();
        c.radius = 5;
        c.x = 10;
        c.y = 20;
        c.draw();
    }
} 
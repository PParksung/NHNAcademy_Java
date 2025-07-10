package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 8
public class Circle2 {
    int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // TODO: Circle 객체 배열 생성 및 데이터 출력
        Circle2[] circles = new Circle2[3];
        circles[0] = new Circle2(3);
        circles[1] = new Circle2(5);
        circles[2] = new Circle2(7);
        for (Circle2 c : circles) {
            System.out.println("radius: " + c.radius);
        }
    }
} 
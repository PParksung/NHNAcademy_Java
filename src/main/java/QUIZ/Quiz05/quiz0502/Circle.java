package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 19
public class Circle {
    double radius;
    double area;

    // TODO: 생성자 작성
    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // TODO: Circle 객체 생성 및 데이터 출력
        Circle c = new Circle(3);
        System.out.println("radius: " + c.radius + ", area: " + c.area);
    }
} 
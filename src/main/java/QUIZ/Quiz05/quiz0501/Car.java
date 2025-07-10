package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 8
public class Car {
    // TODO: 인스턴스 변수와 메서드 선언
    int speed = 0;

    void acclerate(){
        speed += 10;
    }
    public static void main(String[] args) {
        // TODO: Car 객체 생성 및 메서드 호출
        Car car = new Car();
        System.out.println("초기 속도: " + car.speed);
        car.acclerate();
        System.out.print("가속 후 속도: " + car.speed);
    }
} 
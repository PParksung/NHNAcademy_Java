package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 14
class Car14 {
    private String model;
    private int year;

    public Car14() {
        // TODO: this를 사용하여 기본값을 설정하세요.
        this("Unknown Model", 2000);
    }

    public Car14(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car14 car = new Car14();
        car.displayInfo(); // Model: Unknown Model, Year: 2000 출력
    }
} 
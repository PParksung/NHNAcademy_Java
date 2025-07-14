package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 18
class Appliance18 {
    private String brand;

    public Appliance18(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Refrigerator18 extends Appliance18 {
    private int capacity;

    public Refrigerator18() {
        this("Default Brand", 300); // TODO: this로 다른 생성자 호출
    }

    public Refrigerator18(String brand, int capacity) {
        super(brand); // TODO: super로 Appliance 생성자 호출
        this.capacity = capacity;
    }

    public void displayInfo() {
        displayBrand();
        System.out.println("Capacity: " + capacity + "L");
    }
}

class Main18 {
    public static void main(String[] args) {
        Refrigerator18 fridge = new Refrigerator18();
        fridge.displayInfo();
        // Brand: Default Brand
        // Capacity: 300L 출력
    }
} 
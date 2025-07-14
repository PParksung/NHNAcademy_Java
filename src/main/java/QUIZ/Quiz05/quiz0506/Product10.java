package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 10
class Product10 {
    private String name;

    public Product10(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Product: " + name);
    }
}

class Electronic10 extends Product10 {
    private int power;

    public Electronic10() {
        this("Default Electronic", 100); // TODO: this를 사용하여 기본 값 설정
    }

    public Electronic10(String name, int power) {
        super(name); // TODO: super를 사용하여 Product 생성자 호출
        this.power = power;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Power: " + power + "W");
    }
}

class Main10 {
    public static void main(String[] args) {
        Electronic10 electronic = new Electronic10();
        electronic.display();
        // Product: Default Electronic
        // Power: 100W
    }
} 
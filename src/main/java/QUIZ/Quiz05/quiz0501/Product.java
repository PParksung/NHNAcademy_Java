package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 17
public class Product {
    // TODO: 인스턴스 변수와 생성자 선언

    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        // TODO: Product 객체 배열 생성 및 데이터 저장
        Product p1 = new Product("Laptop", 12000);
        Product p2 = new Product("Phone", 800);
        // TODO: 데이터 출력
        System.out.println("제품: " + p1.name + ", 가격: " + p1.price);
        System.out.println("제품: " + p2.name + ", 가격: " + p2.price);
    }
} 
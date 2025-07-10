package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 12
public class Product {
    static int totalProducts;
    String name;

    // TODO: 생성자 작성
    public Product(String name) {
        this.name = name;
        totalProducts++;
    }

    public static void main(String[] args) {
        // TODO: 여러 Product 객체 생성 및 출력
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(totalProducts);
    }
} 
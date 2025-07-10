package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 2
public class Book {
    String title;
    double price;

    // TODO: 매개변수 생성자 작성
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        // TODO: Book 객체 생성 및 초기값 출력
        Book book = new Book("Java Programming", 45.0);
        System.out.println("제목: " + book.title + ", 가격: " + book.price);
    }
} 
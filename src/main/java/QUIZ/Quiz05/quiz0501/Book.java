package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 5
public class Book {
    // TODO: private 변수와 Getter, Setter 선언
    private  String title;
    private  String price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // TODO: Book 객체 생성 및 데이터 설정, 출력
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setPrice("30000");
        System.out.println("제목: " + book.getTitle() +", 가격: " + book.getPrice());
    }
} 
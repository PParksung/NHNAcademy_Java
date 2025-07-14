package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 20
class Book20 {
    private String title;
    private String author;

    public Book20(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        // TODO: this를 사용하여 현재 객체 상태를 반환하세요.
        return "Book: " + this.title + ", Author: " + this.author;
    }

    public static void main(String[] args) {
        Book20 book = new Book20("1984", "George Orwell");
        System.out.println(book);
        // Book: 1984, Author: George Orwell 출력
    }
} 
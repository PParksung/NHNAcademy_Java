package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 20
public class Library {
    static int totalBooks;

    // TODO: static 초기화 블록 작성
    static {
        totalBooks = 0;
    }
    // TODO: 생성자 작성
    public Library() {
        totalBooks++;
    }

    public static void main(String[] args) {
        // TODO: 여러 Library 객체 생성 및 totalBooks 출력
        Library l1 = new Library();
        Library l2 = new Library();
        System.out.println(totalBooks);
    }
} 
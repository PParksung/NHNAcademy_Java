package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 10: 다중 인터페이스와 기본 메서드
interface Readable10 {
    void read();
    default void printType() {
        System.out.println("I am Readable.");
    }
}

interface Writable10 {
    void write();
    default void printType() {
        System.out.println("I am Writable.");
    }
}

public class Document10 implements Readable10, Writable10 {
    @Override
    public void read() {
        System.out.println("Reading the document.");
    }
    @Override
    public void write() {
        System.out.println("Writing to the document.");
    }
    @Override
    public void printType() {
        // TODO: 적절히 메서드를 재정의하여 호출 충돌을 해결하세요.
        System.out.println("과제 너무 많아요");
    }
}

class Main10 {
    public static void main(String[] args) {
        Document10 doc = new Document10();
        doc.read();         // "Reading the document." 출력
        doc.write();        // "Writing to the document." 출력
        doc.printType();    // 적절한 출력 작성
    }
} 
package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 11
public class Rectangle2 {
    int width;
    int height;

    // TODO: toString 메서드 재정의
    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }

    public static void main(String[] args) {
        // TODO: Rectangle 객체 두 개 생성
        Rectangle2 r1 = new Rectangle2();
        r1.width = 10;
        r1.height = 5;
        Rectangle2 r2 = new Rectangle2();
        r2.width = 10;
        r2.height = 5;
        // TODO: equals 메서드 호출
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
    }
} 
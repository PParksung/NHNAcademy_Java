package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 16
public class Box {
    public Box() {
        // TODO: 객체 생성 메시지 출력
        System.out.println("Box 객체 생성");
    }

    public static void main(String[] args) {
        // TODO: Box 객체 생성 및 참조 제거
        Box b = new Box();
        b = null;
        System.out.println("참조 제거");
    }
} 
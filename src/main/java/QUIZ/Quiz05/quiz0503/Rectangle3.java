package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 18
public class Rectangle3 {
    int width;
    int height;

    // TODO: toString 메서드 재정의
    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }

    public static void main(String[] args) {
        // TODO: Rectangle 객체 배열 생성 및 출력
        Rectangle3[] arr = new Rectangle3[2];
        arr[0] = new Rectangle3();
        arr[0].width = 10;
        arr[0].height = 5;
        arr[1] = new Rectangle3();
        arr[1].width = 7;
        arr[1].height = 3;
        for (Rectangle3 r : arr) {
            System.out.println(r);
        }
    }
} 
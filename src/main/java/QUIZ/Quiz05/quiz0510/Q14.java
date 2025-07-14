package QUIZ.Quiz05.quiz0510;

// Quiz 5-10 문제 14
public class Q14 {
    public static void main(String[] args) {
        Counter headCount = new Counter();
        Counter tailCount = new Counter();

        for (int flip = 0; flip < 100; flip++) {
            if (Math.random() < 0.5) {
                headCount.increment();  // 앞면
            } else {
                tailCount.increment();  // 뒷면
            }
        }

        System.out.println("앞면이 나온 횟수: " + headCount.getValue());
        System.out.println("뒷면이 나온 횟수: " + tailCount.getValue());
    }
}

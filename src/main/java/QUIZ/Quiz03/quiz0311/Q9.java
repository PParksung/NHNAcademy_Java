package QUIZ.Quiz03.quiz0311;

// Quiz 3-11 문제 9
public class Q9 {
    public static void main(String[] args) {
    int a = (int)(Math.random() * 10) + 1;

    int b;
    do {
        b = (int)(Math.random() * 10) + 1;
    } while (b == a);

    System.out.println("서로 다른 두 수: " + a + ", " + b);
    }
}

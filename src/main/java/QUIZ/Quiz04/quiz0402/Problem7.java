package QUIZ.Quiz04.quiz0402;

// Quiz 4-2 문제 7
public class Problem7 {
    public static final String DEFAULT_NAME = "Guest";

    public static void main(String[] args) {
        greet("xtra");
        greet(null);
    }

    public static void greet(String name) {
        if (name == null) {
            System.out.println("Hi, " + DEFAULT_NAME);
        } else {
            System.out.println("Hi, " + name);
        }
    }
} 
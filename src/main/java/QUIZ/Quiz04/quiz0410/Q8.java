package QUIZ.Quiz04.quiz0410;

// Quiz 4-10 문제 8
@FunctionalInterface
interface SupplyInt {
    int get();
}

public class Q8 {
    public static void main(String[] args) {
        SupplyInt random = () -> (int)(Math.random() * 6) + 1;
        SupplyInt userInput = () -> {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            return sc.nextInt();
        };
        System.out.println(random.get());
        System.out.println(userInput.get());
    }
} 
package QUIZ.Quiz03.quiz0304;

// Quiz 3-4 문제 20
public class PyramidPattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
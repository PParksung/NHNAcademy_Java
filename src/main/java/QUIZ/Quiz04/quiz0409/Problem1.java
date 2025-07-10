package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.1
public class Problem1 {
    public static void printCapitalized(String str) {
        boolean newWord = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && newWord) {
                System.out.print(Character.toUpperCase(ch));
                newWord = false;
            } else {
                System.out.print(ch);
                if (!Character.isLetter(ch)) {
                    newWord = true;
                } else {
                    newWord = false;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine();
        printCapitalized(input);
    }
} 
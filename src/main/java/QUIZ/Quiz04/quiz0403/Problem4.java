package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 4
public class Problem4 {
    /**
     * str의 각 문자에 대해 해당 문자를 N번 반복 출력합니다.
     * @param str 입력 문자열
     * @param n 반복 횟수
     */

    public static void printRow(char ch, int n){
            for(int i = 0; i < n; i++){
                System.out.print(ch + " ");
            }
            System.out.println();
    }

    public static void printRowsFromString(String str, int n) {
        // TODO: 각 문자의 반복은 printRow 서브루틴 사용
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            printRow(c, n);
        }
    }

    public static void main(String[] args) {
        int n = 25;
        String input = "Java";
        printRowsFromString(input, n);
    }
} 
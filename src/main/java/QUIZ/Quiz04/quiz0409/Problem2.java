package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.2:
public class Problem2 {
    // 주어진 문자의 16진수 값을 반환하는 함수
    public static int hexValue(char ch) {
        switch (Character.toUpperCase(ch)) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        int value = 0;
        boolean valid = true;
        for (int i = 0; i < str.length(); i++) {
            int v = hexValue(str.charAt(i));
            if (v == -1) {
                valid = false;
                break;
            }
            value = value * 16 + v;
        }
        if (valid) {
            System.out.println(value);
        } else {
            System.out.println("유효하지 않은 16진수 문자열");
        }
    }
} 
package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 7-1번
public class BirthdayTriple {
    public static void main(String[] args) {
        int count = 0;
        int[] birthdays = new int[365];
        
        while (true) {
            count = count + 1;
            int birthday = (int)(Math.random() * 365);
            birthdays[birthday] = birthdays[birthday] + 1;
            
            if (birthdays[birthday] == 3) {
                break;
            }
        }
        
        System.out.println("같은 생일을 가진 세 사람을 찾기 위해 " + count + "명이 필요했습니다.");
    }
} 
package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 7-3번
public class BirthdayAllDays {
    public static void main(String[] args) {
        boolean[] hasBirthday = new boolean[365];
        int count = 0;
        int daysFound = 0;
        
        while (daysFound < 365) {
            count = count + 1;
            int birthday = (int)(Math.random() * 365);
            
            if (!hasBirthday[birthday]) {
                hasBirthday[birthday] = true;
                daysFound = daysFound + 1;
            }
        }
        
        System.out.println("모든 날짜에 생일이 있는 사람을 찾기 위해 " + count + "명이 필요했습니다.");
    }
} 
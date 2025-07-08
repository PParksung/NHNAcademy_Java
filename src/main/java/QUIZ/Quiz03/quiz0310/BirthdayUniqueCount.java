package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 7-2번
public class BirthdayUniqueCount {
    public static void main(String[] args) {
        boolean[] hasBirthday = new boolean[365];
        int uniqueCount = 0;
        
        for (int i = 0; i < 365; i++) {
            int birthday = (int)(Math.random() * 365);
            if (!hasBirthday[birthday]) {
                hasBirthday[birthday] = true;
                uniqueCount = uniqueCount + 1;
            }
        }
        
        System.out.println("365명 중에서 서로 다른 생일의 수: " + uniqueCount);
    }
} 
package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 6
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 입력하세요(예: MONDAY): ");
        String dayStr = scanner.nextLine();
        
        try {
            Day day = Day.valueOf(dayStr.toUpperCase());
            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("주중입니다.");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("주말입니다.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 요일입니다.");
        }
    }
} 
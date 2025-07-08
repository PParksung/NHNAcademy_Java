package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Quiz 4-4 문제 15
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 날짜: ");
        String startStr = sc.next();
        System.out.print("끝 날짜: ");
        String endStr = sc.next();
        LocalDate start = LocalDate.parse(startStr);
        LocalDate end = LocalDate.parse(endStr);
        long diff = daysBetween(start, end);
        System.out.println("날짜 차이: " + diff + "일");
    }

    public static long daysBetween(LocalDate start, LocalDate end) {
        // 두 날짜 차이 반환
        return ChronoUnit.DAYS.between(start, end);
    }
} 
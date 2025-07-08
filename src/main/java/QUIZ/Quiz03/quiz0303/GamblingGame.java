package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 16
public class GamblingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int money = 100;
        
        while(money > 0) {
            double random = Math.random();
            if(random > 0.5) {
                money += 10;
            } else {
                money -= 10;
            }
            System.out.println("현재 금액: " + money + "원");
        }
    }
} 
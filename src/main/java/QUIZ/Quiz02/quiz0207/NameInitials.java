package QUIZ.Quiz02.quiz0207;

import QUIZ.textio.TextIO;

//Quiz 2-7 문제 6
public class NameInitials {

    public static void main(String[] args) {
        System.out.println("이름과 성을 공백으로 구분하여 입력하세요.");
        System.out.print("? ");

        String input = TextIO.getln();
        int space = input.indexOf(' ');
        String firstName = input.substring(0, space);
        String lastName = input.substring(space + 1);

        System.out.println("이름은 " + firstName + "이며, " + firstName.length() + "개의 문자로 구성됩니다.");
        System.out.println("성은 " + lastName + "이며, " + lastName.length() + "개의 문자로 구성됩니다.");
        System.out.println("이니셜은 " + firstName.charAt(0) + lastName.charAt(0) + "입니다.");
    }
}
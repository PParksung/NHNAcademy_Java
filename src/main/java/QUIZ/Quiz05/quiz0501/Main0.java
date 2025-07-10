package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 4
public class Main0 {
    public static void main(String[] args) {
        Person person = null;
        if (person == null) {
            System.out.println("Person 객체가 null입니다.");
        } else {
            System.out.println(person.name);
        }
    }
    class Person {
        String name;
    }
} 
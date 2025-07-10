package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 9
public class Person {
    // TODO: 인스턴스 변수 선언
    String name;

    public static void main(String[] args) {
        // TODO: Person 객체 두 개가 동일한 참조를 가짐
        // TODO: 데이터 수정 및 결과 출력
        Person person1 = new Person();
        Person person2 = person1;
        person1.name = "Alice";
        person2.name = "Bob";

        System.out.println("Person 1 Name: " + person1.name);
        System.out.print("Person 2 Name: " + person2.name);

    }
} 
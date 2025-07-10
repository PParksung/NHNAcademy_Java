package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 5
public class Person {
    String name;
    int age;

    // TODO: equals 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        if (this.name.equals(other.name) && this.age == other.age) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO: 두 Person 객체 생성 및 비교
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 20;
        Person p2 = new Person();
        p2.name = "Alice";
        p2.age = 20;
        System.out.println(p1.equals(p2));
    }
} 
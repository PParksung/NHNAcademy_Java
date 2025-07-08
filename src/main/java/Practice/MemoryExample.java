package Practice;

public class MemoryExample {
    public static void main(String[] args) {
        int x = 10;
        Person p1 = new Person("Alice");
        Person p2 = new Person();
        p1.sayHello();
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    Person() {

    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

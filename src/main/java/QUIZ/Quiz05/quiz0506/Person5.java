package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 5
class Person5 {
    private String name;

    public Person5(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee5 extends Person5 {
    private String department;

    public Employee5(String name, String department) {
        // TODO: super를 사용하여 슈퍼클래스의 생성자를 호출하세요.
        super(name);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

class Main5 {
    public static void main(String[] args) {
        Employee5 emp = new Employee5("Alice", "HR");
        emp.display();
        // Name: Alice
        // Department: HR
    }
} 
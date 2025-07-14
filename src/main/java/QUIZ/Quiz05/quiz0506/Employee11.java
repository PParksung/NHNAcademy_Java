package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 11
class Manager11 {
    public void manage(Employee11 employee) {
        System.out.println("Managing: " + employee.getName());
    }
}

class Employee11 {
    private String name;

    public Employee11(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startWork(Manager11 manager) {
        // TODO: this를 사용하여 자신을 Manager의 manage 메서드에 전달하세요.
        manager.manage(this);
    }
}

class Main11 {
    public static void main(String[] args) {
        Employee11 emp = new Employee11("John");
        Manager11 mgr = new Manager11();
        emp.startWork(mgr);
        // Managing: John 출력
    }
} 
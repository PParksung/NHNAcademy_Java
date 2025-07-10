package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 7
public class Person {
    String name;

    // TODO: 생성자 작성
    public Person(String name) {
        if(name == null) {
            throw new IllegalArgumentException("이름이 null입니다");
        }else{
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // TODO: 유효하지 않은 입력으로 Person 객체 생성
        try{
            Person p = new Person(null);
            System.out.println(p.name);
        }catch(Exception e){
            System.out.println(e.getMessage());
        };
    }
} 
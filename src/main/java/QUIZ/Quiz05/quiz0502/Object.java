package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 6
public class Object {
    String value;

    public Object(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // TODO: Object 객체 생성 후 참조를 null로 설정
        // TODO: 더 이상 접근할 수 없는 객체를 주석으로 설명
        Object object =  new Object("성민");
        object = null;
        // 이제 "성민" 값을 가진 object 객체는 어떤 변수도 참조 X
        // 더 이상 접근 불가능한 객체임

    }
} 
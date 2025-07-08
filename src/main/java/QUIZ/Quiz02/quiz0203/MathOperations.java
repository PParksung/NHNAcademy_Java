package QUIZ.Quiz02.quiz0203;

//Quiz 2-3 문제 1
public class MathOperations {
    public static void main(String[] args) {
        int a = 15, b = 4;

        //TODO: Math에 정의된 서브루틴을 이용해 합, 차, 곱, 몫, 나머지를 구하세요.
        int addResult = Math.addExact(a, b);
        int subtractResult = Math.subtractExact(a, b);
        int multiplyResult = Math.multiplyExact(a, b);
        int floorDivResult = Math.floorDiv(a, b);
        int floorModResult = Math.floorMod(a, b);

        System.out.println("합: " + addResult); // 합
        System.out.println("차: " + subtractResult); // 차
        System.out.println("곱: " + multiplyResult); // 곱
        System.out.println("몫: " + floorDivResult); // 몫
        System.out.println("나머지: " + floorModResult); // 나머지
    }
}

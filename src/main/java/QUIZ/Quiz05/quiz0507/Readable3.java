package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 3
public interface Readable3 {
    char readChar();

    // TODO: 기본 메서드 readLine()을 작성하세요.
    default String readLine() {
        StringBuilder line = new StringBuilder();
        char ch = readChar();
        while (ch != '\n') {
            line.append(ch);
            ch = readChar();
        }
        return line.toString();
    }
}

class TextReader3 implements Readable3 {
    private String text = "Hello\n";
    private int index = 0;

    @Override
    public char readChar() {
        // TODO: 임의의 문자나 '\n'을 반환하는 로직을 작성하세요.
        if (index < text.length()) {
            char ch = text.charAt(index);
            index++;
            return ch;
        }
        return '\n';
    }
}

class Main3 {
    public static void main(String[] args) {
        Readable3 reader = new TextReader3();
        System.out.println(reader.readLine()); // 임의의 텍스트 출력
    }
} 
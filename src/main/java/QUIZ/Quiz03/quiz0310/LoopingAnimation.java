package QUIZ.Quiz03.quiz0310;

import javax.swing.*;
import java.awt.*;

// Quiz 3-10 문제 9번
public class LoopingAnimation extends JPanel {
    private int frameNumber;
    
    public static void main(String[] args) {
        JFrame window = new JFrame("애니메이션");
        LoopingAnimation content = new LoopingAnimation();
        window.setContentPane(content);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Timer timer = new Timer(30, e -> {
            content.frameNumber++;
            content.repaint();
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);

        // 구분선 그리기
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);

        // 순환 모션 (위쪽)
        for (int i = 0; i < 3; i++) {
            int cycleLength = 100 + i * 50;
            int x = (frameNumber % cycleLength) * getWidth() / cycleLength;
            g.fillRect(x, 50 + i * 100, 30, 30);
        }

        // 진동 모션 (아래쪽)
        for (int i = 0; i < 3; i++) {
            int cycleLength = 100 + i * 50;
            int position = frameNumber % (2 * cycleLength);
            if (position > cycleLength) {
                position = 2 * cycleLength - position;
            }
            int x = position * getWidth() / cycleLength;
            g.fillRect(x, getHeight()/2 + 50 + i * 100, 30, 30);
        }
    }
} 
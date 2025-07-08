package QUIZ.Quiz03.quiz0310;

import javax.swing.*;
import java.awt.*;

// Quiz 3-10 문제 8번
public class Checkerboard extends JPanel {
    public static void main(String[] args) {
        JFrame window = new JFrame("체커보드");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Checkerboard());
        window.setSize(400, 400);
        window.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col * 50, row * 50, 50, 50);
            }
        }
    }
} 
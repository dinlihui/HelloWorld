package ding;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Rect extends JFrame{
    Rect(){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(80, 80, 50, 50);
        g.drawOval(200, 200, 60, 60);
    }
    public static void main(String[] args) {
        new Rect();
    }
}

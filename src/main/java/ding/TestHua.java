package ding;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestHua extends Frame implements ActionListener{
    int a;
    JButton bt1 = null;
    JButton bt2 = null;
    public TestHua(){
        bt1 = new JButton("画圆");
        bt2 = new JButton("画方");

        this.add(bt1);this.add(bt2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        this.setLayout(new FlowLayout());
        this.setSize(400,400);
        this.show();
    }

    public static void main(String[] args) {
        new huahua();

    } @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(80, 80, 50, 50);
        g.drawOval(200, 200, 60, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bt1){
            repaint();

        } else if(e.getSource()==bt2){
            repaint();
        }

    }

}


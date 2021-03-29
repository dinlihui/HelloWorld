package ding.demo02;

import java.awt.Color;
import java.awt.Graphics;

 public class rightHand extends javax.swing.JPanel implements Runnable {

    int angel = 0;

    public rightHand() {
        initComponents();

        new Thread(this).start();
    }

    private void initComponents() {
    }

    @SuppressWarnings("unchecked")

    @Override
    public void run() {
        while (true) {
            if(angel == 360)
                angel = 0;
            this.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {

            }
            angel += 5;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        for (int i = 0; i <= angel; i++) {
            g.drawArc(45, 100, 100, 100, 0, i);
        }
    }

}



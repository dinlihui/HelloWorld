package ding.demo01;

/**
 * @ClassName RightHand
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2021/3/23
 **/

import java.awt.Color;
import java.awt.Graphics;

public class RightHand extends javax.swing.JPanel implements Runnable {

    int angel = 0;

    public RightHand() {
        initComponents();

        new Thread(this).start();
    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
 this.setLayout(layout);
 layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 400, Short.MAX_VALUE)
 );
 layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 300, Short.MAX_VALUE)
 );
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

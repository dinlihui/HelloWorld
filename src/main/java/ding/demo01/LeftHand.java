package ding.demo01;

/**
 * @ClassName LeftHand
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2021/3/23
 **/

import java.awt.Color;
import java.awt.Graphics;


public class LeftHand extends javax.swing.JPanel implements Runnable {

    int up = 145, down = 45, left = 100, right1 = 150, right2 = 200;

    public LeftHand() {
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
            while (right1 > 100) {
                this.repaint();     //重绘
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                right1 -= 5;
            }
            up = 145;
            while (up > 45) {
                this.repaint();     //重绘
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                up -= 5;
            }
            left = 100;
            while (left < 200) {
                this.repaint();     //重绘
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                left += 5;
            }
            down = 45;
            while (down < 145) {
                this.repaint();     //重绘
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                down += 5;
            }
            right2 = 200;
            while (right2 > 150) {
                this.repaint();     //重绘
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                }
                right2 -= 5;
            }
            right1 = 150;
            up = 145;
            down = 45;
            left = 100;
            right2 = 200;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);

            g.drawLine(145, 150, 145, right1);

            g.drawLine(145, 100, up, 100);

            g.drawLine(45, 100, 45, left);

            g.drawLine(45, 200, down, 200);

            g.drawLine(145, 200, 145, right2);
        }

}

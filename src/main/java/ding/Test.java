package ding;

import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JApplet;

public class Test extends JApplet implements Runnable{
    Thread rec,arc;

    Graphics g;

    int x=0,y=0,width,height,r,gc,b;

    @Override
    public void init(){
        g=getGraphics();

        rec=new Thread(this);

        arc=new Thread(this);

        x=(int)Math.random()%100;

        y=(int)Math.random()%100;

        width=(int)Math.random()%100;

        height=(int)Math.random()%100;

        r=(int)Math.random();

        gc=(int)Math.random();

        b=(int)Math.random();

    }

    @Override
    public void start(){
        try{
            rec.start();

            arc.start();

        }catch(Exception e){}

    }

    @Override
    public void run(){
        if(Thread.currentThread()==rec){
            g.clearRect(0, 0, 200, 200);

            g.setColor(new Color(r,gc,b));

            g.drawRect(x, y, width, height);

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
// TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

        else if(Thread.currentThread()==arc){
            g.clearRect(0, 0, 200, 200);

            g.setColor(new Color(r,gc,b));

            g.drawArc(x, y, width, width, 0, 360);

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
// TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

    }

}



class Rec implements Runnable{
Graphics g;

int x,y,width,height,r,gc,b;

Rec(Graphics g){this.g=g;}

public void init(){
x=(int)Math.random()%100;

y=(int)Math.random()%100;

width=(int)Math.random()%100;

height=(int)Math.random()%100;

r=(int)Math.random();

gc=(int)Math.random();

b=(int)Math.random();

}

@Override
public void run() {
// TODO Auto-generated method stub

g.clearRect(0, 0, 200, 200);

g.setColor(new Color(r,gc,b));

g.drawRect(x, y, width, height);

}

}

class Arc implements Runnable {
    Graphics g;

    int x, y, width, height, r, gc, b;

    Arc(Graphics g) {
        this.g = g;
    }

    public void init() {
        x = (int) Math.random() % 100;

        y = (int) Math.random() % 100;

        width = (int) Math.random() % 100;

        height = (int) Math.random() % 100;

        r = (int) Math.random();

        gc = (int) Math.random();

        b = (int) Math.random();

    }

    @Override
    public void run() {
// TODO Auto-generated method stub

        g.clearRect(0, 0, 200, 200);

        g.setColor(new Color(r, gc, b));

        g.drawArc(x, y, width, width, 0, 360);

    }
}



package planegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;


//为了监听 键盘事件， 实现KeyListener
//为了让Panel 不停的重绘子弹，需要将 MyPanel 实现Runnable ,当做一个线程使用
    public class MyPanel extends JPanel implements KeyListener,Runnable {
        //定义我的坦克
        Hero hero = null;
        Enemy enemy = null;

        public MyPanel() {
            hero = new Hero(300, 500);//初始化自己的飞机
            enemy = new Enemy(500,10);//初始化敌人的飞机

        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.fillRect(0,0,1000,750);//填充矩形，默认黑色
            g.setColor(Color.yellow);
            g.fill3DRect( hero.getX(), hero.getY(), 40, 40, false);

            //画出hero射击的子弹
            if(hero.shot != null && hero.shot.isLive == true) {
                System.out.println("子弹被绘制...");
                g.draw3DRect( hero.shot.x, hero.shot.y, 3, 3, false);
            }

            //画出敌人的飞机
            g.setColor(Color.red);
            g.fill3DRect( enemy.getX(), enemy.getY(), 40, 40, false);


        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        //控制移动方向
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
                //改变方向
                hero.setDirect(0);//
                //修改坐标 y
                hero.moveUp();
            } else if (e.getKeyCode() == KeyEvent.VK_D) {//D键, 向右
                hero.setDirect(1);
                hero.moveRight();

            } else if (e.getKeyCode() == KeyEvent.VK_S) {//S键
                hero.setDirect(2);
                hero.moveDown();
            } else if (e.getKeyCode() == KeyEvent.VK_A) {//A键
                hero.setDirect(3);
                hero.moveLeft();
            }

            //如果用户按下的是J,就发射
            if(e.getKeyCode() == KeyEvent.VK_J) {
                System.out.println("用户按下了J, 开始射击.");
                hero.shotEnemy();
            }
            //让面板重绘
            this.repaint();

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        @Override
        public void run() { //每隔 100毫秒，重绘区域, 刷新绘图区域, 子弹就移动

            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.repaint();
            }

        }
    }

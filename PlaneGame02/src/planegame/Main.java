package planegame;

import javax.swing.*;

/**
 * @MyFunction
 */
public class Main extends JFrame {

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        mp = new MyPanel();
        this.add(mp);//(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
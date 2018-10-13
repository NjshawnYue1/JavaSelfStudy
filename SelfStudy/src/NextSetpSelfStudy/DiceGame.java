package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-12 14:51
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class DiceGame extends JApplet {

  private JTextArea txtResult;  //声明文本框
  private JButton btnStart;    //声明按钮
  private int[] result = new int[13];  //声明并创建用于统计骰子和的数组。

  public void init() {
    Container container = getContentPane();
    setLayout(new FlowLayout());  //设置布局管理器
    txtResult = new JTextArea(15, 20);  //创建文本框
    txtResult.setVisible(true);    //设置组件可见
    btnStart = new JButton("Start");  //创建按钮
    btnStart.setVisible(true);//设置按钮可见

    container.add(txtResult);    //创建的组件加入到JApplet中  把组件添加到窗口中
    container.add(btnStart);
    //为按钮注册事件监听器，该监听器是一个匿名对象。实现当单击按钮时，执行指定的功能
    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 13; i++) {  //数组清0
          result[i] = 0;
        }

        for (int l = 1; l <= 36000; l++) {  //模拟掷骰子
          for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
              int x = 1 + (int) (Math.random() * 6);
              int y = 1 + (int) (Math.random() * 6);
              result[x + y] += 1;  //统计2个骰子的和
            }
          }
        }
        txtResult.setText("");
        double t;
        for (int i = 2; i < 13; i++) {    //输出到文本框中
          t = (double) result[i] * 100 / 36000;
          txtResult.append(i + " =" + result[i] + "\t" +
              t + "\n");
        }
      }

    });
  }

  public void paint(Graphics g) {
  }
}


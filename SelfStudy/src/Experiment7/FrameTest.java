package Experiment7;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ShawnYue
 * @date 2018-11-23 13:39
 */


public class FrameTest {

  //定义该图像中所需要的组件的引用
  private Frame f;
  private Button button;

  private FrameTest() {
    init();

  }

  private void init() {

    f = new Frame("货币兑换");
    f.setBounds(300, 100, 600, 500);
    f.setLayout(null);  //采用流式布局

    button = new Button("兑换");
    button.setBounds(100,100,200,200);
    //将组件添加到 frame中
    f.add(button);

    //加载一下窗体上的事件.
    myEvent();
    //显示窗体
    f.setVisible(true);
  }

  private void myEvent() {
    f.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        //super.windowClosing(e);
        System.exit(0);
      }
    });

    //让按钮具备退出程序的功能
            /*
47          * 按钮就是事件源
48          * 那么选择那个监听器呢?
49          * 通过关闭窗体实例了解到,下个要知道那个组件具备什么样的特有监听器,
50          * 需要查看该组件对象的功能.
51          */
    //添加一个活动监听
    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

        System.out.println("退出, 按钮干的");
        System.exit(0);
      }
    });

  }

  public static void main(String[] args) {
    FrameTest frameTest = new FrameTest();
  }

}

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

  private JTextArea txtResult;  //�����ı���
  private JButton btnStart;    //������ť
  private int[] result = new int[13];  //��������������ͳ�����Ӻ͵����顣

  public void init() {
    Container container = getContentPane();
    setLayout(new FlowLayout());  //���ò��ֹ�����
    txtResult = new JTextArea(15, 20);  //�����ı���
    txtResult.setVisible(true);    //��������ɼ�
    btnStart = new JButton("Start");  //������ť
    btnStart.setVisible(true);//���ð�ť�ɼ�

    container.add(txtResult);    //������������뵽JApplet��  �������ӵ�������
    container.add(btnStart);
    //Ϊ��ťע���¼����������ü�������һ����������ʵ�ֵ�������ťʱ��ִ��ָ���Ĺ���
    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 13; i++) {  //������0
          result[i] = 0;
        }

        for (int l = 1; l <= 36000; l++) {  //ģ��������
          for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
              int x = 1 + (int) (Math.random() * 6);
              int y = 1 + (int) (Math.random() * 6);
              result[x + y] += 1;  //ͳ��2�����ӵĺ�
            }
          }
        }
        txtResult.setText("");
        double t;
        for (int i = 2; i < 13; i++) {    //������ı�����
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


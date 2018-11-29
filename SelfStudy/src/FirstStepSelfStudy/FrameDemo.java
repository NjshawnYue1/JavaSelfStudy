package FirstStepSelfStudy;

import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author ShawnYue
 * @date 2018-10-31 10:23
 */
public class FrameDemo {

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("example");
    jFrame.setSize(150, 100);
    jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    /*创建面板 并在框架中指定其位置  可以在里面添加文本字段 按钮和其他组件*/

    JPanel jPanel = new JPanel();
    jFrame.add(jPanel);
    jPanel.setLayout(null);

    JLabel jLabel = new JLabel("User: ");
    /*定义组件的位置 setBounds(x,y,width,height);*/
    jLabel.setBounds(10, 20, 80, 15);
    jPanel.add(jLabel);

    /*创建文本框用于输入*/
    JTextField jTextField = new JTextField(10);
    jTextField.setBounds(80, 20, 165, 15);
    jPanel.add(jTextField);

    JLabel jLabelPassword = new JLabel("Password: ");
    jLabelPassword.setBounds(10, 40, 80, 15);
    jPanel.add(jLabelPassword);

    /*创建密码对应的文本框用于输入*/
    JPasswordField jPasswordField = new JPasswordField(10);
    jPasswordField.setBounds(80, 40, 165, 15);
    jPanel.add(jPasswordField);

    Button button = new Button("login");
    button.setBounds(10,60,30,40);
    jPanel.add(button);

    jFrame.setVisible(true);
  }

}

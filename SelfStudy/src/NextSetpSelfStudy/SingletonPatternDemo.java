package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-19 15:01
 */
public class SingletonPatternDemo {

  public static void main(String[] args) {
    //���Ϸ��Ĺ��캯��
    //����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
    //SingleObject object = new SingleObject();

    //��ȡΨһ���õĶ���
    SingleObject object = SingleObject.getInstance();

    //��ʾ��Ϣ
    object.showMessage();
  }

}

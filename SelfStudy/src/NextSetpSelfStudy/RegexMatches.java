package NextSetpSelfStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ShawnYue
 * @date 2018-10-17 10:17
 */
public class RegexMatches {

  public static void main(String[] args) {
    //��ָ��ģʽ���ַ�������
    String line = "This order was placed for QT3000! OK?";
    String pattern = "(\\D*)(\\d+)(.*)";
    //�������ַ����ֳ����� \D����ʾ������ \d����ʾ����  .��ƥ��������ַ�
    /**Java����Ҫ����һ��������ʽ�ķ�б�ߣ����������ַ��������������
     * һ��������ʽ��������ͨ���ַ��������ַ�a��z���Լ������ַ���Ԫ�ַ�����ɵ�����ģʽ
     * �����ڲ�����������ʱ��ƥ���һ�������ַ���
     * ��������������ʽ��ƥ����ַ���
     * [abc] a��b �� c�����ࣩ
     * [^abc] �κ��ַ������� a��b �� c���񶨣�
     * [a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ��
     * [a-d[m-p]] a �� d �� m �� p��[a-dm-p]��������
     * [a-z&&[def]] d��e �� f��������
     * [a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ��
     * [a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ��
     * .��ƥ��������ַ�
     * \d����ʾ����
     * \D����ʾ������
     * \s����ʾ�ɿ��ַ���ɣ�[ \t\n\r\x\f]
     * \S����ʾ�ɷǿ��ַ���ɣ�[^\s]
     * \w����ʾ��ĸ�����֡��»��ߣ�[a-zA-Z0-9_]
     * \W����ʾ��������ĸ�����֡��»������
     *
     * �������ʽ
     * 1.?: ��ʾ����0�λ�1��
     * 2.+: ��ʾ����1�λ���
     * 3.*: ��ʾ����0�Ρ�1�λ���
     * 4.{n}����ʾ����n��
     * 5.{n,m}����ʾ����n~m��
     * 6.{n,}����ʾ����n�λ�n������
     * ���͵ĵ���˳����
     * ָ��Ϊ�ַ�����������ʽҪ��ʵ��ΪPattern��Ķ���
     * ����ʹ�ø�ģʽ����Matcher�����
     *  Pattern p = Pattern.compile("a*b");
     *  Matcher m = p.matcher("aaaaab");
     *  boolean b = m.matches();
     *
     *  ��Ч��boolean b = Pattern.matches("a*b","aaaaab");
     *  �����ʵ���ǲ��ɱ�ģ��ɹ���������̰߳�ȫʹ��
     * */

    //����Pattern����
    Pattern p = Pattern
        .compile(pattern);//Pattern p = Pattern.compile("a*b");Pattern��Ĺ��췽����˽�е� ʵ����������Ҫ��������

    //����matcher����
    Matcher m = p.matcher(line);
    if (m.find()) {
      System.out.println("Found value: " + m.group(0));//�洢�����ַ�������
      System.out.println("Found value: " + m.group(1));
      System.out.println("Found value: " + m.group(2));
      System.out.println("Found value: " + m.group(3));
    } else {
      System.out.println("NO MATCH");
    }
  }

}

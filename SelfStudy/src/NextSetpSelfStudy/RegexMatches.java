package NextSetpSelfStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ShawnYue
 * @date 2018-10-17 10:17
 */
public class RegexMatches {

  public static void main(String[] args) {
    //按指定模式在字符串查找
    String line = "This order was placed for QT3000! OK?";
    String pattern = "(\\D*)(\\d+)(.*)";
    //把整个字符串分成三组 \D：表示非数字 \d：表示数字  .：匹配任意的字符
    /**Java中我要插入一个正则表达式的反斜线，所以其后的字符具有特殊的意义
     * 一个正则表达式就是由普通的字符（例如字符a到z）以及特殊字符（元字符）组成的文字模式
     * 可以在查找文字主体时待匹配的一个或多个字符串
     * 即搜索与正则表达式相匹配的字符串
     * [abc] a、b 或 c（简单类）
     * [^abc] 任何字符，除了 a、b 或 c（否定）
     * [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
     * [a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）
     * [a-z&&[def]] d、e 或 f（交集）
     * [a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
     * [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）
     * .：匹配任意的字符
     * \d：表示数字
     * \D：表示非数字
     * \s：表示由空字符组成，[ \t\n\r\x\f]
     * \S：表示由非空字符组成，[^\s]
     * \w：表示字母、数字、下划线，[a-zA-Z0-9_]
     * \W：表示不是由字母、数字、下划线组成
     *
     * 数量表达式
     * 1.?: 表示出现0次或1次
     * 2.+: 表示出现1次或多次
     * 3.*: 表示出现0次、1次或多次
     * 4.{n}：表示出现n次
     * 5.{n,m}：表示出现n~m次
     * 6.{n,}：表示出现n次或n次以上
     * 典型的调用顺序是
     * 指定为字符串的正则表达式要被实例为Pattern类的对象
     * 接着使用该模式创建Matcher类对象
     *  Pattern p = Pattern.compile("a*b");
     *  Matcher m = p.matcher("aaaaab");
     *  boolean b = m.matches();
     *
     *  等效于boolean b = Pattern.matches("a*b","aaaaab");
     *  此类的实例是不可变的，可供多个并发线程安全使用
     * */

    //创建Pattern对象
    Pattern p = Pattern
        .compile(pattern);//Pattern p = Pattern.compile("a*b");Pattern类的构造方法是私有的 实例化对象需要这样操作

    //创建matcher对象
    Matcher m = p.matcher(line);
    if (m.find()) {
      System.out.println("Found value: " + m.group(0));//存储的是字符串本身
      System.out.println("Found value: " + m.group(1));
      System.out.println("Found value: " + m.group(2));
      System.out.println("Found value: " + m.group(3));
    } else {
      System.out.println("NO MATCH");
    }
  }

}

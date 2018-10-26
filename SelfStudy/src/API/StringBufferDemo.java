package API;

/**
 * @author ShawnYue
 * @date 2018-10-25 18:39
 */
public class StringBufferDemo {

  public static void main(String[] args) {
    /*
     * 用于存储数据的容器 建议优先使用StringBuilder（单线程）
     *
     * 1.长度可变 2.可以存储不同类型的数据3.可以对字符串进行修改
     *
     * 添加
     * append(data); 返回了StringBuffer对象
     * 删除
     * delete(start,end)
     * delete(charAt(int index))
     * 查找
     * char charAt(int index);
     * int indexOf(string);
     * int lastIndexOf(string);
     * 修改
     * StringBuffer replace(start,end,string);不包含end
     * void setCharAt(index,char);修改单个字符
     *
     * */
  }

  public static void bufferMethodDemo() {
    //创建缓冲区对象
    StringBuffer strbuf = new StringBuffer();
  }

}

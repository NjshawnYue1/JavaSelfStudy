package com.usts.jdk8;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MethodRefTest.java
 * @Description TODO
 * @createTime 2019年08月28日 12:29:00
 */
public class MethodRefTest {

    /*
     * 方法引用的使用情景 当要传递给lambda表达式的操作已经自己的实现了，比如说打印语句，传递给他的操作是打印
     * 但是打印语句有自己的实现，这个时候就可以用方法引用代替lambda表达式，本质上他们是相同的。
     *
     * 就是说 方法的参数现在都不需要先指定，只看方法是否是静态的 如果是静态方法就通过类名调用如果是非静态方法就通过对象调用
     *
     * 使用要求：接口中的抽象方法的形参列表(通常指定为泛型)和返回值类型是否与方法引用所使用的方法的形参列表和返回值一致
     *
     * 这一切还是基于函数式接口来做的 也就是说有两个条件一个事接口中的抽象方法 一个是想要使用方法引用的类或对象的方法 这两个方法必须
     * 满足上述条件
     *
     * 本来想做的事是用lambda表达式来简写这个接口的实现 现在等于是再简写了这个表达式 这里适用的情况是对象调用非静态以及类调用非静态
     * 当类去调用静态的时候且方法接收的两个参数将在方法体中一个参数作为调用者，一个作为入参 比如compare方法接受了(s1,s2)
     * 字符串类型的对象本身也有自己的方法，s1.compareTo(s2) 此时我们默认接口函数中接受的参数一个作为调用者一个作为方法的参数
     * 就可以将表达式简写成String::compareTo
     */

    @Test
    public void test1(){
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("nihao");

        Consumer<String> con2 = System.out::println;
        con2.accept("hello");
    }
}

package com.usts.jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName LambdaTest.java
 * @Description Lambda表达式使用举例
 * @createTime 2019年08月28日 10:04:00
 */
public class LambdaTest {

    /*
     * lambda操作符 -> (o1,o2) -> Integer.compare(o1,o2);
     * 左边是形参列表 接口中的抽象方法的形参列表
     * 右边是抽象方法的方法体
     * 本质 表达式的本质还是接口的一个实例 java的对象特点
     *
     * 对接口本身的要求是接口只只能有一个抽象的方法 也就是函数式接口 可以使用注解FunctionalInterface来验证
     *
     * 匿名实现类都可以用这样的方式实现
     *
     *
     */

    /**
     * 1.无参无返回值
     * 通过上下比较发现 重写的run方法不需要接受参数且方法的结果是没有返回值的也就是void类型
     * 当采用lambda表达式来写的时候()表示的就是方法的参数列表 ->到语句结束表示的就是原来的方法体
     */
    @Test
    public void test() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r1.run();


        System.out.println("-------------------------");
        Runnable r2 = () -> System.out.println("hello");
        r2.run();
    }

    /**
     * 需要一个参数但是函数没有返回结果的
     */
    @Test
    public void test2() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con.accept("shawnyue");

        Consumer<String> con2 = (String s) ->  System.out.println(s);
        con2.accept("hello");
    }

    /**
     * 数据类型可以省略，因为可由编译器推断得出，称为类型推断
     */
    @Test
    public void test3() {


        Consumer<String> con2 = (s) -> System.out.println(s);
        con2.accept("hello");
    }

    /**
     * 只需要一个参数时 括号也可以省略
     */
    @Test
    public void test4() {
        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("hello");

    }

    /**
     * 需要两个或以上的参数，多条执行语句并且可以有返回值
     */

    @Test
    public void test5() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        // 此时括号不可以省且方法体因为有不止一个执行语句的原因大括号也不可以省略。
        Comparator<Integer> com = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
    }

    /**
     * 若方法体只有一条执行语句那么大括号和return都可以省略
     */
    @Test
    public void test6() {
        Comparator<Integer> com = (o1, o2) -> o1.compareTo(o2);

        System.out.println(com.compare(12, 6));

    }
}

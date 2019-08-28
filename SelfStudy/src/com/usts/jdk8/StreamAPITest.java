package com.usts.jdk8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName StreamAPITest.java
 * @Description TODO
 * @createTime 2019年08月28日 13:53:00
 */

public class StreamAPITest {

    /**
     * stream关注数据的运算 他不会改变存储的元素 不会改变原对象 回返回一个持有结果的新stream 且stream执行的是延迟执行的
     * 只有当他执行中止操作之后前面执行的一系列 操作才会真正的执行
     */
    @Test
    public void test() {
        List<String> list = Arrays.asList("1", "2", "3");
        /*
         * 返回一个顺序流 按照存储的顺序
         */
        Stream<String> stringStream = list.stream();
        /*
         * 返回一个并行流
         */
        Stream<String> stream = list.parallelStream();

        /*
         * 中间操作
         * filter limit skip返回一个跳过指定个数的元素的流如果个数超过集合中的数目那么将返回空 distinct 去除重复元素
         *
         * 每次执行完终止操作之后就需要重新创建一个流
         *
         */
        stringStream.filter("2"::equals).forEach(System.out::println);
        list.stream().limit(2).forEach(System.out::println);

    }
}

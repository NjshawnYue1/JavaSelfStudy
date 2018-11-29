package SoftwareHw;

/**
 * @author ShawnYue
 * @date 2018-11-12 19:49
 *
 * (1) 在FileIOMain.java中18-20行和76-80行以及hw3_input.txt中更改相应的个人信息，例如： 学号：040411214 姓名：邹恩岑 运动：爬山 (2)
 * 新建java项目，名为file_io，新建或导入FileIOMain类，请使用提供的FileIOMain.java的源代码。 (3)
 * 将hw3_input.txt拷贝到d盘根目录，改写FileIOMain.readFile()方法中相关代码，使用循环能够读取"d:/hw3_input.txt"文件
 * 全部内容并打印到屏幕，提示：需要使用BufferedReader.ready()方法，判断文件访问是否到文件末尾。 (4) 改写FileIOMain.writeFile()方法中相关代码，使用循环输出FileIOMain.outputList至d:/hw3_output.txt文件
 * (5) 完成作业的程序运行截图，写入实验报告。项目文件夹和"hw3_output.txt"文件拷贝至自己的git本地代码库相应目录并push 至git云端。
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class FileIOMain {

  private ArrayList outputList = new ArrayList();

  FileIOMain() {
    outputList.add("学号：16200135233");
    outputList.add("姓名：顾安");
    outputList.add("我爱学习：java");
    for (int i = 0; i < 1000; i++) {
      String morning = "Good Morning";
      outputList.add(morning + i);
    }
  }

  public void readFile(String filePath) throws IOException {
    File file;
    FileReader fr;
    BufferedReader br;

    file = new File(filePath);
    if (!file.exists()) {
      System.out.println("\"" + filePath + "\" does not exist!");
      return;
    }

		/*
		1.FileReader是由java.io.InputStreamReade扩展来的，是针对文件读取的，只能进行底层的字节操作。
		BufferedReader由Reader类扩展而来，提供通用的缓冲方式文本读取，而且提供了很实用的readLine，读取分行文本很适合，BufferedReader是针对Reader的，不直接针对文件，也不是只针对文件读取。
		2.FileReader是用来读文件的类，而BufferReader是将IO流转换为Buffer以提高程序的处理速度。
		*/
    fr = new FileReader(file);
    br = new BufferedReader(fr);

    /*作业：改写以下代码，使用循环读取文件全部内容并打印到屏幕，提示：需要使用BufferedReader.ready()方法，判断文件访问是否到文件末尾*/
    String lineText;
    while (br.ready()) {
      lineText = br.readLine();
      System.out.println(lineText);
    }
    /*作业end*/
    br.close();
  }

  public void writeFile(String filePath) throws IOException {
    File file;
    FileWriter fw;
    PrintWriter pw;

    file = new File(filePath);
    if (!file.exists()) {
      file.createNewFile();
    }
    fw = new FileWriter(file);
    pw = new PrintWriter(fw);

    /*作业：改写以下代码，使用循环输出FileIOMain.outputList至文件*/
    Iterator iterator = outputList.iterator();
    while (iterator.hasNext()) {
      pw.println(iterator.next());
    }
    /*作业end*/

    pw.close();
  }

  public static void main(String[] args) throws IOException {
    FileIOMain io = new FileIOMain();
    io.readFile("d:/hw3_input.txt");
    io.writeFile("d:/hw3_output.txt");
  }

}


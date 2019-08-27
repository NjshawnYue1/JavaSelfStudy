package SoftwareHw;

import java.util.Arrays;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName TestCommon.java
 * @Description TODO
 * @createTime 2019年08月26日 00:38:00
 */
public class TestCommon {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(stringBuffer));
    }
    public  static boolean Find(int target, int [][] array) {
        boolean flag = true;
        for(int i = 0; i < array.length;i++){
            for(int j = 0;j < array[j].length;j++){
                if(array[i][j] == target){
                    return flag;
                }
            }

        }

        return false;
    }

    public  static int getLength(int [][] array){
        return array.length;
    }

    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        char[] c = s.toCharArray();
        StringBuffer ans = new StringBuffer();

        for (char value : c) {
            if (value == ' ') {
                ans.append("%20");
            } else {
                ans.append(value);
            }
        }
        return ans.toString();
    }




}

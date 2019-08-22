public class TwoNumPlus {

    public static void main(String[] args) {

                System.out.println(multiply("23","23"));
    }
    public static String multiply(String numStr1,String numStr2){
        int numLen1 = numStr1.length();
        int numLen2 = numStr2.length();

        int[] numArray1 = new int[numLen1]; //数字数组
        int[] numArray2 = new int[numLen2];



        // "12345"-> [5,4,3,2,1]
        for(int i=0;i<numLen1;i++){
            String c = numStr1.substring(i,i+1);
            numArray1[numLen1-i-1] = Integer.parseInt(c); //低位存字符串尾部数字
        }
        for(int i=0;i<numLen2;i++){
            String c = numStr2.substring(i,i+1);
            numArray2[numLen2-i-1] = Integer.parseInt(c); //低位存字符串尾部数字
        }


        int minLen = 0; //取长度小的数位数
        int maxLen = 0; //取长度大的数位数
        int[] maxArray = null; //长度大的数
        int[] minArray = null; //长度小的数
        if(numLen1<numLen2){
            minLen = numLen1;
            maxLen = numLen2;
            minArray = numArray1;
            maxArray = numArray2;
        }else{
            minLen = numLen2;
            maxLen = numLen1;
            minArray = numArray2;
            maxArray = numArray1;
        }

        //二维数组存储结果，例如：23*23 ->[[6,9],[4,6]] ,内部括号（低维）存某位的相乘结果，高维低位存个位,十位...
        int[][] resultArray = new int[minLen][maxLen+1];

        //长度大的数*长度小的数的每一位，分别存到相应数组中，然后累加
        for(int h=0;h<minLen;h++){ //高维
            int l=0;
            int added = 0;
            for(;l<maxLen;l++){ //低维
                int t = maxArray[l]*minArray[h]+added; //长度大的数的每一位*长度小的数的个位、十位...
                if(t>9){
                    added = t/10; //进位
                    resultArray[h][l] = t%10; //当前位计算结果
                }else{
                    added = 0; //不进位
                    resultArray[h][l] = t; //当前位计算结果
                }
            }
            resultArray[h][l] = added; //个位、十位...的计算结果的最高位
        }

        //对结果补位（左移），个位不动，十位补0，百位补00...，然后累加
        int[] sum = null; //最终累加结果
        int[] lowBitResult = null; //低位补0结果（前一位）
        for(int h=0;h<minLen;h++){
            int[] bitResult =  resultArray[h];
            int[] r;  //个位、十位...的补0结果
            if(h==0){ //个位
                r  = bitResult;
                sum = r;
                lowBitResult = r; //记录下来，待下次循环累加
            }else{ //十位...的计算结果
                r = new int[resultArray[h].length+h]; //初始化默认就是0的
                int rLen = r.length-1;
                for(int i=bitResult.length-1;i>=0;i--){ //从高位开始复制到新数组
                    r[rLen--] = bitResult[i];
                }
                //累加之前的数
                sum = new int[r.length+1]; //取高位长度+1，可能进位

                //================加法核心算法====================
                //两数长度相同的部分，同位相加，超出9进1
                int added = 0;
                int i=0;
                for(;i<lowBitResult.length;i++){
                    int t = lowBitResult[i]+r[i]+added; //两数相加，再加进位
                    if(t>9){
                        added = 1; //进1
                        sum[i] = t-10; //当前位计算结果
                    }else{
                        added = 0; //不进位
                        sum[i] = t; //当前位计算结果
                    }
                }
                //长度超出部分累加
                for(;i<r.length;i++){
                    int t = r[i]+added; //多余位数加上进位
                    if(t>9){
                        added = 1; //进1
                        sum[i] = t-10; //当前位计算结果
                    }else{
                        added = 0; //不进位
                        sum[i] = t; //当前位计算结果
                    }
                }
                sum[i] = added; //最高位
                //===============================================

                lowBitResult = sum; //记录下来，待下次循环累加
            }
        }

        //拼接结果 [1,4,8,2,0] -> 2841
        StringBuilder builder = new StringBuilder();
        boolean existHighNotZero = false; //高位存在不为0的，这个0就不能移除
        for(int n=sum.length-1;n>=0;n--){
            //移除高位无效的0，保留最后一个0
            if(sum[n]==0 && !existHighNotZero && n!=0){
                continue; //跳过
            }else{
                existHighNotZero = true;
                builder.append(sum[n]);
            }
        }

        return builder.toString();
    }
}

package com.again.test.jexercise.basic.binary;
/**
 * Created by dogrex on 2018/2/21.
 */
public class _01_Convert {

    /**
     * 做整数（10进制）与其他进制的转化<p>
     * <p>
     * 例如：对于十进制数10来说，它的各个进制表示方式分别是：
     * <p>
     * <li>2进制:  1010
     * <li>8进制:  12
     * <li>16进制: A
     *
     * @param n     一个正整数
     * @param radix 进制，取值范围为{2，8，16}，不考虑其他值
     * @return 对应进制的字符串序列
     */
    public static String convertInt(int n, int radix) {
//        if(radix==2){
///           x=Integer.toBinaryString(n).toString();
//
//        }else if(radix==8){
//            x=Integer.toOctalString(n).toString();
//        }else if(radix==16){
//            x=Integer.toHexString(n).toString();
//        }
        char[] arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String in="";
        while(n != 0){
            int f = n % radix;
            in+=arr[f];
            n=(n-f)/radix;
            if(n==0 ){break;}else if(n==1){in+="1";break;}
        }

        char[] arr2=in.toCharArray();
        int y=Math.round(arr2.length/2);
        for(int j =0;j<y;j++){
            char z = arr2[j];
            arr2[j]=arr2[arr2.length-1-j];
            arr2[arr2.length-1-j]=z;
        }
        String x=String.valueOf(arr2);
        return x;
    }
}

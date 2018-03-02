package com.again.test.jexercise.basic.binary;

/**
 * Created by dogrex on 2018/2/21.
 */
public class _01_Convert {

    /**
     * 编码规范，常量的标准写法，改成全部大写，单词之间下划线分割
     */
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

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
        String result = "";
        while (n != 0) {
            result = HEX_ARRAY[n % radix] + result;
            n /= radix;
        }
        return result;
    }
}

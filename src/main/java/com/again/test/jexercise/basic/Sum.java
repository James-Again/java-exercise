package com.again.test.jexercise.basic;

/**
 * Created by dogrex on 2018/2/20.
 * <p>
 * 描述：给定一个正整数n，给出从1-n之间数字的和<p>
 * <p>
 * 示例：<p>
 * 输入：10 <br>
 * 输出：55（1+2+3...+10）<br>
 */
public class Sum {

    public static int sum(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        return s;
    }
}

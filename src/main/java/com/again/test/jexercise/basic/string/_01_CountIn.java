package com.again.test.jexercise.basic.string;

public class _01_CountIn {
    /**
     * 在一个字符串中找到包含对应的字符的数量<p></p>
     * <p>
     * 示例：<br>
     * countIn("xx123",'x') = 2
     *
     * @param str
     * @param target
     * @return
     */
    public static int countIn(String str, char target) {
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                t++;
            }
        }
        return t;
    }
}

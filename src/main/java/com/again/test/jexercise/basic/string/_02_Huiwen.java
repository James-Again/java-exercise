package com.again.test.jexercise.basic.string;

/**
 * "回文字符串"的特点是：将字符串倒序之后，和原来的字符串是一样的，比如："x","xx","xax","xaax"都是回文字符串，"xxa"则不是
 */
public class _02_Huiwen {
    /**
     * 判断是否是回文字符串
     *
     * @param source
     * @return
     */
    public static boolean isHuiwen(String source) {
        int j = 0;
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(j) != source.charAt(i)) {
                return false;
            }
            j++;
        }
        return true;
    }
}

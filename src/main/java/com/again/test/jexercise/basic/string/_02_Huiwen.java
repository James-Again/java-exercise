package com.again.test.jexercise.basic.string;

/**
 * "回文字符串"的特点是：将字符串倒序之后，和原来的字符串是一样的，比如："x","xx","xax","xaax"都是回文字符串，"xxa"则不是
 */
public class _02_Huiwen {
    /**
     * 判断是否是回文字符串
     * @param source
     * @return
     */
    public static boolean isHuiwen(String source) {
        char schar[]=source.toCharArray();
        int lenchar=schar.length-1;
        String source2="";
        for (int i=lenchar;i>=0;i--){
            source2+=schar[i];
        }
        if(source.substring(0,source.length()).equals(source2)){return true;}else {return false;}
    }
}

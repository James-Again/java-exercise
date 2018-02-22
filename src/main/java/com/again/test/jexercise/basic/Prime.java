package com.again.test.jexercise.basic;

/**
 * Created by dogrex on 2018/2/20.
 * <p>
 * 素数的定义：正整数中除了1以外，只能被1和他自己整除的整数
 */
public class Prime {

    /**
     * 判断一个正整数是否为素数
     *
     * @param n 一个正整数
     * @return 给定的正整数是否是素数
     */
    public static boolean isPrime(int n) {
        boolean u = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                u = false;
                break;
            }
        }


        return u;
    }

    /**
     * 返回1-n之间所有的素数的数量
     *
     * @param n 一个正整数
     * @return 1-n之间所有的素数的数量
     */
    public static int primeCount(int n) {
        int t = 0;
        boolean u = true;
        for (int j = 2; j <= n; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    u = false;
                    break;
                } else {
                    u = true;
                }
            }
            if (u == true) {
                t += 1;
            }
        }
        return t;
    }
}


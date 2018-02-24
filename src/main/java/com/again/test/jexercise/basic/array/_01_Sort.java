package com.again.test.jexercise.basic.array;

public class _01_Sort {

    /**
     * 对给定的整数数组中的元素进行排序<p>
     * <p>
     * 示例：<p></p>
     * <p>
     * 下列数组：{1,3,2} 的排序结果为：{1,2,3}
     *
     * @param array
     */
    public static void sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int z=array[j];
                    array[j]=array[j+1];
                    array[j+1]=z;
                }
            }
        }
    }

}

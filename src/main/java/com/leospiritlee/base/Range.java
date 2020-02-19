package com.leospiritlee.base;

/**
 * @Project: JavaStudyDemo
 * @ClassName Range
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-02-16 15:07
 **/
public class Range {


    // Produce a sequence [0,n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    // Produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = start + i;
        }
        return result;
    }
    // Produce sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }

    /**
     *  按规则生成数组
     * @param i
     * @return
     */
    public static int[] range(Integer... i){

        if(null == i || i.length == 0){
            return new int[0];
        }

        switch (i.length){
            case 1:
                int[] newArray_1 = new int[i[0]];
                for(int j = 0; j < i[0]; j++){
                    newArray_1[j] = j;
                }
                return newArray_1;
            case 2:
                int[] newArray_2 = new int[i[0]];
                for(int j = 0; j < i[0]; j++){
                    newArray_2[j] = j + i[0];
                }
                return newArray_2;
            case 3:
                Integer increaseValue = i[2];
                if(increaseValue > 0){
                    //5, 20 , 3
                    // 0 长度+ 起始位置  1 null 2 累加值
                    int rangeStartAndLength = i[0];
                    int[] newArray_3 = new int[rangeStartAndLength];
                    for(int j = 0, value = rangeStartAndLength; j < rangeStartAndLength; j++, value = value + increaseValue){
                        newArray_3[j] = value ;
                    }
                    return newArray_3;

                }else {
                    //20, 5 , -3
                    //0 起始  1 长度  2 累加值
                    int rangeLength = i[1];
                    int rangeStart = i[0];
                    int[] newArray_3 = new int[rangeLength];
                    for(int j = 0, value = rangeStart; j < rangeLength; j++, value = value + increaseValue){
                        newArray_3[j] = value ;
                    }
                    return newArray_3;
                }

            default:
                break;
        }

        return new int[0];
    }

}

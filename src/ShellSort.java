package src;

import java.util.Arrays;

/**
 * 希尔排序
 * 关键词 增量
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] ints = new int[]{10,2,9,3,6,7,11,0,1,4,5,8};
        System.out.println(Arrays.toString(ints));
        int increament = ints.length/4;
        while (increament>0){
        for (int i = increament; i < ints.length ; i++) {
            for (int j = i; j >=increament ; j-=increament) {
                if(ints[j]<ints[j-increament]){
                    int replace_num = ints[j];
                    ints[j] = ints[j-increament];
                    ints[j-increament]= replace_num;
                }
            }
        }
        increament/=2;
        }
        System.out.println(Arrays.toString(ints));

    }
}

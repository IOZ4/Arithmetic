package src;

import java.util.Arrays;

/**删除一个元素
 * @author Aaron
 * @create 2020-11-14 12:43
 */
public class ArrDelete {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(ints));
//        要删除的坐标
        int dis = 2;
        int[] ints1 = new int[ints.length-1];
        for (int i = 0; i <ints.length-1 ; i++) {
            if(i<dis){
                ints1[i]=ints[i];
            }else{
                ints1[i] = ints[i+1];
            }
        }
        System.out.println(Arrays.toString(ints1));
    }
}

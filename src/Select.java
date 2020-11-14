import java.util.Arrays;

/**选择排序
 * 将当前位置的数和剩下位置的所有数进行比较取最值
 *从小到大排序
 * @author Aaron
 * @create 2020-11-14 14:16
 */
public class Select {
    public static void main(String[] args) {
        int[] ints = new int[]{4,2,1,6,3,0,5};
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i <ints.length-1 ; i++) {
            int extreme_mum = ints[i];
            for (int j = i+1; j <ints.length ; j++) {
                if(ints[i]>ints[j]){
                    int replace_num = ints[i];
                    ints[i] = ints[j];
                    ints[j] = replace_num;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}

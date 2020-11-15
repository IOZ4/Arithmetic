package src;
import java.util.Arrays;

/**插入排序
 * 思想：每次取一个和前面已经排好序的数组进行排序  插入到已经排好序的数组中
 * @author Aaron
 * @create 2020-11-14 16:33
 */
public class Insertion {
    public static void main(String[] args) {
        int[] ints = new int[]{10,2,5,3,4,1,9,8};
        System.out.println(Arrays.toString(ints));
        for (int i = 1; i <ints.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(ints[j]>ints[j-1]){
                    int replace_num = ints[j];
                    ints[j] = ints[j-1];
                    ints[j-1] = replace_num;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}

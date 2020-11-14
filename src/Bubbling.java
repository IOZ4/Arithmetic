import java.util.Arrays;

/**
 *
 *冒泡排序、
 * 在一次循环里将本次循环中将最值，“浮出水面”
 * @author Aaron
 * @create 2020-11-14 13:35
 */
public class Bubbling {
    public static void main(String[] args) {
        /*
        从小到大排序
         */
        int[] ints = new int[]{13,1,0,4,2,5,3};
        for (int i = 1; i <ints.length; i++) {
            for (int j = 0; j <(ints.length-i) ; j++) {
                if (ints[j]>ints[j+1]){
                    int replace_num;
                    replace_num = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = replace_num;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}

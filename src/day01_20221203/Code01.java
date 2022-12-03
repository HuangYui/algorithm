package day01_20221203;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Code01
 * @Description: 打印出整数的32位信息
 * @date : 2022/12/3 18:20
 */
public class Code01 {

    private static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num&(1<<i)) == 0 ? "0":"1");
        }
    }

    public static void main(String[] args) {
        int a = 5;
//        print(a);
        print(Integer.MAX_VALUE);
    }
}

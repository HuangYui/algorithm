package day02_20221204;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Code01
 * @Description: 算出 1! + 2! + 3! + ... + n! ,普通写法与进阶写法
 * @date : 2022/12/4 15:14
 */
public class Code01 {

    /**
     * 算出一个数的阶乘
     *
     * @param num num
     */
    public static int caculate(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * 算出 1! + 2! + 3! + ... + n!
     *
     * @param num n
     * @return int
     */
    public static int caculateAll(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += caculate(i);
        }
        return sum;
    }

    /**
     * 进阶写法
     * 1 * 1   +
     * 1 * 1 * 2 +
     * 1 * 1 * 2 * 3 +
     * 1 * 1 * 2 * 3 * 4 +
     * 1 * 1 * 2 * 3 * 4 * 5
     * @param num num
     * @return int
     */
    public static int caculateAllV2(int num) {
        int a = 1;
        int sum = 0 ;
        for (int i = 1; i <= num; i++) {
            a = a * i;
            //记录每一次乘完之后的值，就是前一个数的阶乘比如 1*2*3*4 就是4的阶乘 下次循环再进*5就是5的阶乘
            sum += a;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(caculateAll(10));;
        System.out.println(caculateAllV2(10));;
    }



}

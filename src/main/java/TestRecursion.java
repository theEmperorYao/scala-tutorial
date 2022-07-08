/**
 * @Classname TestRecursion
 * @Description TODO
 * @Date 2022/7/8 22:59
 * @Author by tangyao
 */
public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));

    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial2(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial2(n - 1) * n;
    }



}

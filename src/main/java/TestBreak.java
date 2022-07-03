/**
 * @Classname TestBreak
 * @Description TODO
 * @Date 2022/7/3 02:26
 * @Author by tangyao
 */
public class TestBreak {

    public static void main(String[] args) {

        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
//                    break;
                    throw new RuntimeException();
                }
                System.out.println(i);
            }
        } catch (Exception e) {

        }
        System.out.println("这是循环外的代码");
    }
}

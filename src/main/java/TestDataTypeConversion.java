/**
 * @Classname TestDataTypeConversion
 * @Description TODO
 * @Date 2022/6/26 02:05
 * @Author by tangyao
 */
public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);
        char c = 'a';
        test((short) c);

    }

//    private static void test(byte b) {
//        System.out.println("bbbb");
//    }

//    private static void test(short b) {
//        System.out.println("ss");
//    }

//    private static void test(char b) {
//        System.out.println("cc");
//    }

    private static void test(int b) {
        System.out.println("3ii");
    }

}

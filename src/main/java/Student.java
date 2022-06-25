import chapter01.HelloWorld;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2022/6/25 14:03
 * @Author by tangyao
 */

public class Student {


    private String name;
    private Integer age;
    private static String school = "奥特之星";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + school);
    }

    public static void main(String[] args) {
//        Student alice = new Student("alice", 20);
//        Student bob = new Student("bob", 20);
//        alice.printInfo();
//        bob.printInfo();

    }

}

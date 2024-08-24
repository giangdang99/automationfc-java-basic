package javaBasic;

public class Topic_01_Variable_02 {
    //global variables
    static int number;

    static String address = "Ho Chi Minh";
    public static void main(String[] args) {
        //local variables
        int studentNumber = 0;

        System.out.println(number);

        System.out.println(studentNumber);

        Topic_01_Variable_02 topic = new Topic_01_Variable_02();
        System.out.println(Topic_01_Variable_02.address);

    }
}

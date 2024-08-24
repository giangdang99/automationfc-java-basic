package javaBasic;

import java.util.Scanner;

public class Topic_03_Operator_Homework {
    public static void main(String[] args) {

        //lesson 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("After 15 years, age of " + age + " will be " + (age + 15));

        //lesson 2
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        System.out.println("Bien doi gia tri a va b: ");
        System.out.println("a = " + ((a + b)-a));
        System.out.println("b = " + ((a + b)-b));

        //lesson 3
        System.out.print("A= ");
        int A = scanner.nextInt();
        System.out.print("B= ");
        int B = scanner.nextInt();
        boolean status = (A > B) ? true : false;
        System.out.println(status);

    }
}

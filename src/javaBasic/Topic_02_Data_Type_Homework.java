package javaBasic;

import java.util.Scanner;

public class Topic_02_Data_Type_Homework {

    static int a;
    static int b;
    static int chieuDai;
    static int chieuRong;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tinh tong/hieu/tich/thuong 2 so
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("P1="+ (a+b));
        System.out.println("P2="+ (a-b));
        System.out.println("P3="+ (a*b));
        System.out.println("P4="+ (a/b));

        //Dien tich hinh chu nhat
        System.out.println("Chieu dai hinh chu nhat la = ");
        chieuDai = scanner.nextInt();
        System.out.println("Chieu rong hinh chu nhat la = ");
        chieuRong= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dien tich hinh chu nhat (P) = "+ (chieuDai*chieuRong));

        //in ra text
        System.out.println("Nhap text = ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Đóng đối tượng Scanner
        scanner.close();

    }


}

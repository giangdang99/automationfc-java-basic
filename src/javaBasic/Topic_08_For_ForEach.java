package javaBasic;

import java.util.Scanner;

public class Topic_08_For_ForEach {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao tu ban phim so nguyen n, hien thi tu 1 toi n, cach nhau 1 khoang trang
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }


        //A & B
        //so nguyen a va b, in ra cac so o giua
        System.out.println("Number a= ");
        int a = scanner.nextInt();
        System.out.println("Number b= ");
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }

        //tinh  tong cac so chan tu a den b
        int sum1 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("Sum of even numbers: " + sum1);


        //tinh tong cac so chia het cho 3 tư a den b
        int sum2 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum2 += i;
            }
        }
        System.out.println("Sum of multiples of 3: " + sum2);


        //N
        //nhap so n, tinh tong so chan tu 0 den n
        System.out.print("Number: ");
        int num = scanner.nextInt();
        int sum3 = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum3 += i;
            }
        }
        System.out.println("Sum of even numbers: " + sum3);


        //nhap so n, tinh tong so le tu 0 den n
        System.out.print("Number: ");
        int sum4 = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                sum4 += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum4);

        //tinh giai thua n
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);




    }
}

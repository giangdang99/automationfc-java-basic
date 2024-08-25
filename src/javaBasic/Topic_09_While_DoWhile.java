package javaBasic;

import java.util.Scanner;

public class Topic_09_While_DoWhile {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao so nguyen n, hien thi ra cac so chan tu n toi 100
        //while
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n1 = ");
        int n_1 = scanner.nextInt();

        int i_1 = 0;
        while (i_1 <= n_1) {
            if (i_1 % 2 == 0) {
                System.out.println(" ");
                System.out.print(i_1 + " ");
            }
            i_1++;
        }
        System.out.println(" ");

        //do while
        System.out.print("Nhap n2 = ");
        int n_2 = scanner.nextInt();

        int i_2 = 0;
        do {
            if (i_2 % 2 == 0) {
                System.out.println(" ");
                System.out.print(i_2 + " ");
            }
            i_2++;
        } while (i_2 <= n_2);


        //nhap a va b, hien thi cac so chia het cho 3 va 5
        //while
        System.out.print("Nhap a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap b = ");
        int b = scanner.nextInt();

        int i_3 = a;
        while (a <= i_3 && b >= i_3) {
            if (i_3 % 15 == 0) {
                System.out.println(" ");
                System.out.print(i_3 + " ");
            }
            i_3++;
        }
        System.out.println(" ");

        //do while
        System.out.print("Nhap A = ");
        int A = scanner.nextInt();
        System.out.print("Nhap B = ");
        int B = scanner.nextInt();

        int i_4 = A;
        do {
            if (i_4 % 15 == 0) {
                System.out.println(" ");
                System.out.print(i_4 + " ");
            }
            i_4++;


        } while (A <= i_4 && B >= i_4);


        //nhap n, hien thi tong cac so le tu 0 toi n
        //while
        System.out.print("Nhap number = ");
        int number = scanner.nextInt();

        int i_5 = 1;
        int sum_1 = 0;
        while(i_5<=number)
        {
            if (i_5% 2!=0) {
                sum_1 += i_5;
            }
            i_5++;
        }
        System.out.println("Tong cac so le tu 0 toi " + number + " la: " + sum_1);


    }

}

package javaBasic;

import java.util.Scanner;

public class Topic_06_Condition_Statement_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kiem tra chan le
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if((number%2)==0){
            System.out.println(number + ": is even");
        } else {
            System.out.println(number + ": is odd");
        }

        //so sanh 2 so nguyen a b
        System.out.println("a= ");
        int a = scanner.nextInt();
        System.out.println("b= ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than or equal a");
        }

        //so sanh ten cua 2 nguoi
        System.out.println("Name 1: ");
        String name1 = scanner.nextLine();
        System.out.println("Name 2: ");
        String name2 = scanner.nextLine();

        if(name1.compareToIgnoreCase(name2) > 0){
            System.out.println(name1 + " is greater than " + name2);
        } else {
            System.out.println(name2 + " has name as same as " + name1);
        }

        //so sanh 3 so A,B,C
        System.out.println("A= ");
        int A = scanner.nextInt();
        System.out.println("B= ");
        int B = scanner.nextInt();
        System.out.println("C= ");
        int C = scanner.nextInt();

        if(A > B && A > C){
            System.out.println("A is the greatest");
        } else if(B > A && B > C){
            System.out.println("B is the greatest");
        } else {
            System.out.println("C is the greatest");
        }

        //kiem tra so nhap vao co nam trong doan [10,100]
        System.out.println("Number: ");
        int numberInRange = scanner.nextInt();

        if(numberInRange >= 10 && numberInRange <= 100){
            System.out.println(numberInRange + ": is in range [10,100]");
        } else {
            System.out.println(numberInRange + ": is not in range [10,100]");
        }

        //kiem tra diem nhap vao cua sinh vien
        System.out.println("Score: ");
        double score = scanner.nextDouble();

        if(score > 0 && score < 5){
            System.out.println(score + "D");
        } else if(score > 5 && score < 7.5) {
            System.out.println(score + "C");
        } else if(score > 7.5 && score < 8.5) {
            System.out.println(score + "B");
        } else if(score > 8.5 && score < 10) {
            System.out.println(score + "A");
        }


        //nhap vao mot thang, hien thi ngay cua thang do - dung if else
        System.out.println("Month: ");
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            System.out.println(month + " has 31 days");
        } else if (month == 3 || month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println(month + " has 30 days");
        } if (month == 2){
            System.out.println(month + " has 28 days (assuming a non-leap year)");
        }

    }
}

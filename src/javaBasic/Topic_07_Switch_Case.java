package javaBasic;

import java.util.Scanner;

public class Topic_07_Switch_Case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 28 or 29 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }


        //ten cac chu so nhap vao bang tieng anh
        System.out.print("Number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid number");
        }

        // + - * / %  tư 2 so a va b
        System.out.println("a= ");
        int a = scanner.nextInt();
        System.out.println("b= ");
        int b = scanner.nextInt();
        System.out.println("Phep tinh: ");
        String pheptinh = scanner.nextLine();
        switch (pheptinh) {
            case "+":
                System.out.println("Phep cong: " + (a + b));
                break;
            case "-":
                System.out.println("Phep tru: " + (a - b));
                break;
            case "*":
                System.out.println("Phep nhan: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Loi: Chia cho 0!");
                } else {
                    System.out.println("Phep chia: " + (a / b));
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Loi: Chia cho 0!");
                } else {
                    System.out.println("Phep chia lay du: " + (a % b));
                }
                break;
            default:
                System.out.println("Phep toan tu khong hop le!");
        }

    }

}

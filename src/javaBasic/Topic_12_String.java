package javaBasic;

import java.util.Scanner;

public class Topic_12_String {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Choose options: /t 1. In ra so luong chu hoa trong chuoi " +
                "\n 2. Thuc hien cac thao tac cua chuoi" +
                "\n 3. Dao chuoi" +
                "\n 4. Thong bao dung sai khi nhap sdt ");
        int options = scanner.nextInt();
        switch (options){
            case 1:
                //in ra so luong chu hoa trong chuoi
                System.out.print("Enter a string: ");
                String topic = scanner.nextLine();
                int countUpperCase = 0;
                for (int i = 0; i < topic.length(); i++) { // vòng lặp cho số lượng kí tự, i=0 là ở vị trí kí tự đầu tiên, topic.length(); là kí tự tối đa của chuỗi, i++ tăng dần
                    char c = topic.charAt(i); //gán  biến kí tự trong đó topic.charAt(i); là kí tự ở vị trí i
                    if (Character.isUpperCase(c)) { //nếu kí tự đúng là viết hoa thì đếm +1
                        countUpperCase++;
                    }
                }
                System.out.println("Number of uppercase letters: " + countUpperCase); //in ra số lượng kí tự viết hoa của chuỗi
                break;
            case 2:
                //Thuc hien cac thao tac cua chuoi
                String textInput = "Automation Testing 345 Tutorials Online 789";
                System.out.println("Select options of case 2: ");
                int option2 = scanner.nextInt();
                switch (option2){
                    case 1:
                        //Dem so luong ki tu la chu 'a' trong chuoi
                        int countA = 0;
                        for (int i = 0; i < textInput.length(); i++) {
                            char c = textInput.charAt(i);
                            if (c == 'a') {
                                countA++;
                            }
                        }
                        System.out.println("Number of 'a' in the string: " + countA);
                        break;
                    case 2:
                        //Kiem tra chuoi co tu testing hay khong - dung boolean
                        boolean isTesting = textInput.toLowerCase().contains("testing");
                        System.out.println("Is 'testing' in the string: " + isTesting);
                        break;
                    case 3:
                        //Kiem tra chuoi co bat dau bang tu 'Automation' hay khong - dung boolean
                        boolean isStartWithAutomation = textInput.startsWith("Automation");
                        System.out.println("Is start with 'Automation' in the string: " + isStartWithAutomation);
                        break;
                    case 4:
                        //Kiem tra chuoi co ket thuc bang tu 'Online' hay khong - dung boolean
                        boolean isEndWithOnline = textInput.endsWith("Online");
                        System.out.println("Is end with 'Online' in the string: " + isEndWithOnline);
                        break;
                    case 5:
                        //lay vi tri cua tu 'Automation' trong chuoi
                        int indexAutomation = textInput.toLowerCase().indexOf("automation");
                        System.out.println("Index of 'Automation' in the string: " + indexAutomation);
                        break;
                    case 6:
                        //Thay the tu 'Online' bang tu 'Offline' va in ra chuoi sau khi thay the
                        String newText = textInput.replace("Online", "Offline");
                        System.out.println("New string after replacement: " + newText);
                        break;
                    case 7:
                        //Dem ki tu la number co trong chuoi
                        int countNumber = 0;
                        for (int i = 0; i < textInput.length(); i++) {
                            char c = textInput.charAt(i);
                            if (Character.isDigit(c)) {
                                countNumber++;
                            }
                        }
                        System.out.println("Number of digits in the string: " + countNumber);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 3:
                System.out.println("Select options of case 3: ");
                int option3 = scanner.nextInt();
                switch (option3){
                    case 1:
                        //Dao chuoi 1
                        String input1 = "Automation FC";
                        String reversed1 = new StringBuilder(input1).reverse().toString();
                        System.out.println("Reversed string: " + reversed1);
                        break;
                    case 2:
                        //Dao chuoi 2
                        String input2 = "Coding";
                        String reversed2 = new StringBuilder(input2).reverse().toString();
                        System.out.println("Reversed string: " + reversed2);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 4:
                //Nhap vao day so co 10 so, so dau tien phai bat dau bang 7 hoac 8 hoac 9, hien thi thong bao dung sai sau khi nhap
                System.out.print("Enter 10 digits: ");
                String sdt = scanner.nextLine();
                if (sdt.startsWith("7") || sdt.startsWith("8") || sdt.startsWith("9")) {
                    System.out.println("Valid SDT");
                } else {
                    System.out.println("Invalid SDT. It should start with 7, 8 or 9");
                }
                break;
            default:
                System.out.println("Invalid option");
        }




    }
}

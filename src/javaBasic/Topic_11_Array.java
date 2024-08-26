package javaBasic;

public class Topic_11_Array {

    public static void main(String[] args) {


        //cho mot mang cac so nguyen - hay viet chung trinh hien thi ra phan tu lon nhat trong mang
        int[] numbers = {10, 5, 8, 15, 20};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("Phan tu lon nhat trong mang la: " + maxNumber);

        //cho mot mang so nguyen - hay viet chung trinh hien thi ra tong cua phan tu dau tien va phan tu cuoi cung trong mang array
        int sum = numbers[0] + numbers[numbers.length - 1];
        System.out.println("Tong cua phan tu dau tien va phan tu cuoi cung trong mang la: " + sum);


        //cho mot mang cac so nguyen - viet chuong trinh hien thi ra man hinh nhung so chan trong mang
        System.out.println("Cac so chan trong mang la: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        //cho mot mang cac so nguyen - viet chuong trinh hien thi ra man hinh nhung so le lon hon 0 trong mang
        System.out.println("Cac so le lon hon 0 trong mang la: ");
        for (int number : numbers) {
            if (number > 0 && number % 2 == 1) {
                System.out.print(number + " ");
            }
        }

        //cho mot mang cac so nguyen - viet chuong trinh hien thi ra man hinh nhung so  >=0 va <=10 trong mang
        System.out.println("Cac so >=0 va <=10 trong mang la: ");
        for (int number : numbers) {
            if (number >= 0 && number <= 10) {
                System.out.print(number + " ");
            }
        }

        //cho mot mang cac so nguyen - viet chuong trinh hien thi ra tong va trung binh cong cua cac phan tu trong mang
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        double average = (double) sumOfNumbers / numbers.length;
        System.out.println("Tong cua cac phan tu trong mang la: " + sumOfNumbers);
        System.out.println("Trung binh cong cua cac phan tu trong mang la: " + average);

        //viet chuong trinh hien thi ra thong tin sinh vien voi cac thuoc tinh: ID, Name, Score. Ham khoi tao gia tri cho cac thuoc tinh. phuong thuc: displayed() - in ra console ID/Name/age/score(point)
        //giong bai mau cua a Dam
    }


}

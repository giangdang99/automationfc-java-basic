package javaBasic;

public class Topic_06_Condition_Statement_If_Else {
    public static void main(String[] args) {
        boolean status = 5>3;
        System.out.println(status);

        //Hàm kiểm tra duy nhất 1 điều kiện
        if (status){
            System.out.println("Go to if");
        }

        //có tới 2 điều kiện: đúng thì vào if - sai thì vào else
        String address = "HCM";
        if (address == "Ha Noi"){
            System.out.println("Go to if");
        } else {
            System.out.println("Go to else");
        }

        //có tới 3 điều kiện: đúng thì vào if - đúng vào else if - sai thì vào else
        int number = 5;
        if (number == 1){
            System.out.println("Number is 1");
        } else if (number == 2){
            System.out.println("Number is 2");
        } else {
            System.out.println("Number is not 1 or 2");
        }

        //Nếu muốn dùng nhiều điều kiện cùng một lệnh, dùng ternary operator
        int number1 = 5;
        String result = number1 == 1? "Number is 1" : "Number is not 1";
        System.out.println(result);


        //Nếu muốn sử dụng nhiều điều kiện, dùng switch-case
        int number3 = 5;
        switch (number3) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
        }

    }
}

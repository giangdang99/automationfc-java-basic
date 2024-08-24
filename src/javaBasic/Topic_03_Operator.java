package javaBasic;

public class Topic_03_Operator {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 15;

        number +=5;
        number = number +5;
        System.out.println(number);

        // 15/5 = 3
        System.out.println(number / 5);

        // 15%6 = 2 dư 3
        System.out.println(number % 6);

        System.out.println(number2++);
        System.out.println(++number2);
        System.out.println(number--);


        //in ra 0, 1, 2
        for (int i = 0; i <3; i++){
            System.out.println(i);
        }

        //in ra 0, 1,2
        for (int i = 0; i <3; ++i){
            System.out.println(i);
        }

        if(5<6){
            System.out.println("5<6");
        }

        String address = "HCM";
        if(address != "Ha Noi" && address!="Da Nang"){
            System.out.println("Address is the same");
        }

        if(!(address == "Ha Noi")){
            System.out.println("Address is the same");
        }


        // tam nguyen
        boolean status = (address == "Ha Noi") ? true : false;
        System.out.println(status);

    }
}

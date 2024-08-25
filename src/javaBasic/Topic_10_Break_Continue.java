package javaBasic;

public class Topic_10_Break_Continue {
    public static void main(String[] args) {
        //vi du ve continue
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        //vi du ve break
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }

        //vi du ve break trong switch case
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            case 3:
                System.out.println("Number 3");
                break;
            case 4:
                System.out.println("Number 4");
                break;
            case 5:
                System.out.println("Number 5");

        }
    }
}

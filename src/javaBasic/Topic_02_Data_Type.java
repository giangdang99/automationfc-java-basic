package javaBasic;

import java.awt.*;
import java.awt.print.Book;
import java.util.*;
import java.util.List;

public class Topic_02_Data_Type {
    //Primitive types/ value types: Nguyên thủy
    byte bNumber = 6;
    short sNumber;
    int iNumber;
    long lNumber = 65000l;
    float fNumber  = 1.0f;
    double dNumber = 15.98d;

    char cCharacter = '1';
    boolean bStatus = false;
    //reference types: tham chiếu
        //Array types
             int[] numbers = {1, 2, 3};
             String[] names = {"John", "Alice", "Bob"};

        //String types
             String name = "John";
             StringBuilder stringBuilder = new StringBuilder("John");
             StringBuffer stringBuffer = new StringBuffer("John");

        //Class types
            class Person {
                String name;
                int age;
            }

            Topic_02_Data_Type topic;


        //Enum types
             Color color = Color.RED;
             Book book = new Book();
             Runnable runnable = () -> System.out.println("Hello world!");


        //Interface types
            interface Drawable {
                void draw();
            }

        //Object
            Object object = new Object();

        //Collection types
            //List/Set types/Queue types/Map types
                List<String> giang = new ArrayList<>();
                Set<String> dang = new HashSet<>();
                Queue<String> danggiang = new LinkedList<>();
                Map<String, Integer> dangthigiang = new HashMap<>();



                public void clickToElement(){
                    name.trim();
                    names.clone();
                    object.toString();
                    giang.size();
                    dang.size();
                    danggiang.element();
                    dangthigiang.get("John");

                }
    public static void main(String[] args) {

    }
}

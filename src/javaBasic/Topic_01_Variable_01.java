package javaBasic;

public class Topic_01_Variable_01 {
    static int studentNumber;
    static boolean status;
    static final String browserName = "Chrome";

    String studentName = "Automation FC";

    public static void main(String[] args){
        System.out.println(studentNumber);
        System.out.println(status);
    }

    // getter: getCurrentUrl/getTitle/getText/getAttribute/getCssValue/getSize...
    public int getStudentNumber(){
        return this.studentNumber;
    }

    //sette: click/
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

}
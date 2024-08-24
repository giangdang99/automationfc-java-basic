package javaBasic;

public class Topic_04_Referance_Casting {
    protected  String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void showStudentName() {
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args) {
        Topic_04_Referance_Casting firstStudent = new Topic_04_Referance_Casting();
        Topic_04_Referance_Casting secondStudent = new Topic_04_Referance_Casting();

        firstStudent.setStudentName("John");
        secondStudent.setStudentName("Alice");

        firstStudent.showStudentName();
        secondStudent.showStudentName();

        //Ép kiểu
        firstStudent = secondStudent;

        firstStudent.showStudentName();
        secondStudent.showStudentName();

        secondStudent.setStudentName("Nguyen");

        firstStudent.showStudentName();
        secondStudent.showStudentName();

    }
}

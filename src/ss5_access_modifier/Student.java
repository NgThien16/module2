package ss5_access_modifier;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    public Student(){

    }
    public void setName(){

    }
    public void setClasses(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name: " + s1.name);
        System.out.println("Classes: " + s1.classes);
    }
}
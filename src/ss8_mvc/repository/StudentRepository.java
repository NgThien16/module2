package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[100];
    static{
        students[0] = new Student(1, "Thien", 4.5f);
        students[1] = new Student(2, "Danh", 9.0f);
    }

    @Override
    public Student[] findAll() {
        //code read file
        return students;
    }

    @Override
    public boolean add(Student student) {
        //code write file
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        return true;
    }

}

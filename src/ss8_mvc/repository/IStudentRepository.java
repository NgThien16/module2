package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public interface IStudentRepository {

    Student[] findAll();
    boolean add(Student student);
}

package ss8_mvc.service;

import ss8_mvc.entity.Student;

public interface IStudentService {
    Student[] findAll();
    boolean add(Student student);
}

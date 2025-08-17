package ss8_mvc.service;

import ss8_mvc.entity.Student;
import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean add(Student student) {
        Student[] students = studentRepository.findAll();
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null){
                if (students[i].getId()==student.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return studentRepository.add(student);
    }
}
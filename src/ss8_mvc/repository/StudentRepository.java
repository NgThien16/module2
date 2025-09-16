package ss8_mvc.repository;

import ss8_mvc.entity.Student;
import ss8_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String STUDENT_FILE = "src/ss8_mvc/data/student.csv";
    @Override
    public List<Student> findAll(){
        //code đọc
        List<Student> studentList = new LinkedList<>();
        try{
            List<String> stringList = ReadAndWriteFile.readFileCSV(STUDENT_FILE);
            String[] array = null;
            for(int i = 0; i < stringList.size(); i++){
                array = stringList.get(i).split(",");
                Student student = new Student(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]));
                studentList.add(student);
            }
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        return studentList;
    }
    @Override
    public boolean add(Student student){
        List<String> list = new LinkedList<>();
        list.add(student.getInfoToCSV());
        try{
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE, list,true);
        }catch(IOException e){
            System.out.println("Error writing file");
            return false;

        }
        return true;
    }
    @Override
    public boolean deleteById(int id){
        boolean isSuccessDelete = false;
        List<Student> studentList = this.findAll();
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getId() == id){
                studentList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new LinkedList<>();
        // convert from listStudent tolistString
        for(int i = 0; i < studentList.size(); i++){
            stringList.add(studentList.get(i).getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE, stringList,false);

        }catch(IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }
}

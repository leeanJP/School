package school;

import java.util.ArrayList;

public class School {

    private static School instance = new School();

    private static String SCHOOL_NAME = "BUSAN School";

    private ArrayList<Student> studentList = new ArrayList<>(); // 등록된 학생
    private ArrayList<Subject> subjectList = new ArrayList<>(); // 과목 리스트

    private School(){} //기본생성자

    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public ArrayList<Subject> getSubjectList(){
        return subjectList;
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }





}

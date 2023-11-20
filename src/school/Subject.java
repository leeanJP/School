package school;

import util.Define;

import java.util.ArrayList;

public class Subject {
    private String subject; //과목 이름
    private int SubjectId;  //과목 고유번호
    private int gradeType;  //학점평가 정책

    //이 과목을 수강 신청한 학생 리스트
    //register() 호출하면 이 리스트에 추가됨
    private ArrayList<Student> studentList = new ArrayList<>();


    public Subject(String subject, int subjectId) {
        this.subject = subject;
        SubjectId = subjectId;
        this.gradeType = Define.AB_TYPE;  //학점 평가 정책을 A,B 방식을 사용
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student){
        studentList.add(student);
    }
}

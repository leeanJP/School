package school;

public class Score {
    int studentId; //학번
    Subject subject;//과목
    int point; //점수

    //생성자


    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    //getter 및 setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "학번 :" + studentId +"," + subject.getSubject() + ": "+ point;
    }
}

import java.util.List;
import java.util.ArrayList;
class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentEnrolled = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("\nList student yang mengambil course: " + courseCode);
        for (Student student : studentEnrolled) {
            student.getDetails();
        }
    }

    public void getDetails() {
        System.out.println("==========Detail Course==========");
        System.out.println("Kode course: " + courseCode);
        System.out.println("Nama Course: " + courseName);
        System.out.println("Dosen Pengampu: " + lecture.getName());
    }
}
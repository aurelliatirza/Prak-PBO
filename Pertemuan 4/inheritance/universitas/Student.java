import java.util.List;
import java.util.ArrayList;
class Student extends Person {
    private int studentId;
    private List<Course> courseEnrolled;

    public Student(String name, int age, String address, int studentId) {
        super(name, age, address);
        this.studentId = studentId;
        this.courseEnrolled = new ArrayList<>();
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void enrollInCourse(Course course) {
        courseEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        System.out.println("\nList course yang diambil oleh " + getName() + " antara lain:");
        for (Course course : courseEnrolled) {
            course.getDetails();
        }
    }
}

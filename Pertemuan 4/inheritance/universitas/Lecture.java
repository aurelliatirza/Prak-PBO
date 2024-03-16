import java.util.List;
import java.util.ArrayList;
class Lecture extends Person {
    private int employeeId;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeId = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("\nList course yang diampu oleh " + getName() + " antara lain:");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
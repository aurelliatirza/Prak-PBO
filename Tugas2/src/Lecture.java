import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeId;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeId = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void getDetails() {
        System.out.println("==========Detail Dosen==========");
        System.out.println("ID Dosen: " + employeeId);
        System.out.println("Nama Dosen: " + name);
        System.out.println("Umur Dosen: " + age);
        System.out.println("Alamat Dosen: " + address);
    }    

    public void teachCourse(Course course) { 
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("\nList course yang diampu dosen " + name + " ialah : \t");
        for(Course course: coursesTaught){
            course.getDetails();
        }
    }

    
}
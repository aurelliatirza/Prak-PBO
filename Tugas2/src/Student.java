import java.util.List;
import java.util.ArrayList;

public class Student {
    //Tambahin access modifiernya
    private String name;
    private int age;
    private String address;
    private int studentId;
    private List<Course> courseEnrolled;

    //Method
    public Student(String name, int age, String address, int studentId){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentId = studentId;
        this.courseEnrolled = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public int getStudentId(){
        return this.studentId;
    }

    //Menampilkan detail data diri mahasiswa
    public void getDetails(){
        System.out.println("==========Detail Mahasiswa==========");
        System.out.println("NIM: " + studentId);
        System.out.println("Nama Mahasiswa: " + name);
        System.out.println("Umur Mahasiswa: " + age);
        System.out.println("Alamat Mahasiswa: " + address);
    }

    //untuk menambah course mahasiswa
    public void enrollInCourse(Course course) {
        courseEnrolled.add(course);
    }

    //nampilin list course yang diambil oleh mahasiswa
    public void viewEnrolledCourses() {
        System.out.println("\nList course yang diambil oleh " + name + " antara lain: \t");
        for (Course course: courseEnrolled){
            course.getDetails();
        }
    }
    
    

}




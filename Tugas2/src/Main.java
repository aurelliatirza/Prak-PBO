public class Main {
    public static void main(String[] args) {
        //Buat Objek Mahasiswa
        Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
        Student dani = new Student("Dani", 20, "123 Oak St", 734621);
        Student edi = new Student("Edi", 20, "789 Pine St", 733451);

        //Buat Objek Dosen
        Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);

        //Buat Objek course
        Course cs101 = new Course("CS101", "Intro to Computer Science", bambang);
        Course cs102 = new Course("CS102", "Data Structures", agus);
        Course cs103 = new Course("CS103", "Algorithms", agus);

        //Detail Mahasiswa
        cahyo.getDetails();
        dani.getDetails();
        edi.getDetails();

        //Detail Dosen
        System.out.println("\n");
        agus.getDetails();
        bambang.getDetails();

        //Detail Kursus
        System.out.println("\n");
        cs101.getDetails();
        cs102.getDetails();
        cs103.getDetails();

        //Dosen bertambah course yang diampunya
        System.out.println("\n");
        agus.teachCourse(cs102);
        agus.teachCourse(cs103);
        bambang.teachCourse(cs101);
        agus.viewTaughtCourses();
        agus.viewTaughtCourses();
        bambang.viewTaughtCourses();

        //Menambahkan anak ke dalam course
        System.out.println("\n");
        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);
        cs101.viewEnrolledStudents();

        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
        cs102.viewEnrolledStudents();

        cs103.addStudent(cahyo);
        cs103.viewEnrolledStudents();

        //Menghapus anak dari course
        cs101.removeStudent(cahyo);
        cs101.viewEnrolledStudents();

        //Anak Menambahkan course yang diinginkan
        System.out.println("\n");
        cahyo.enrollInCourse(cs102);
        cahyo.enrollInCourse(cs103);
        cahyo.viewEnrolledCourses();

        dani.enrollInCourse(cs101);
        dani.enrollInCourse(cs102);
        dani.viewEnrolledCourses();

        edi.enrollInCourse(cs101);
        edi.viewEnrolledCourses();

        //Lihat course yang diampu oleh seorang dosen
        System.out.println("\n");
        agus.viewTaughtCourses();
        bambang.viewTaughtCourses();

     
    }
    
}
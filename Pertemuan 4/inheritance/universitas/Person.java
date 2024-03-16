import java.util.List;
import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void getDetails() {
        System.out.println("==========Detail Person==========");
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
    }
}

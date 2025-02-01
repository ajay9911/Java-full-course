package Coding.challenges;

public class StudentDetail {
    int id;
    String name;
    int age;
    String city;

    public StudentDetail(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\''
               ;
    }

    public static void main(String[] args) {

        StudentDetail student=new StudentDetail(101,"Ajay",20,"Greater Noida");
        System.out.println(student);
    }
}

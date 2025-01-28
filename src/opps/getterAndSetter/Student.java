package opps.getterAndSetter;

public class Student {
    private int rollNo;
    private String name;
    private  String address;
    private String phone;

    public Student(int rollNo, String name, String address, String phone) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

import java.io.Serializable;

public class Nguoi implements Serializable{
    private static final long serialVersionUID = 8683452581122892189L;

    private String name;
    private int age;
    private String gender;
    private String phone;

    public Nguoi() {
    }

    public Nguoi(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String ghi() {
        return name + "," + age + "," + gender + "," + phone;
    }


}

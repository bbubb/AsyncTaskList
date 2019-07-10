package what.is.asynctasklist;

public class Person {
    public Person() {
    }

    public Person(String name, String phone, String picture) {
        Name = name;
        Phone = phone;
        Picture = picture;
    }

    private String Name, Phone, Picture;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }
}

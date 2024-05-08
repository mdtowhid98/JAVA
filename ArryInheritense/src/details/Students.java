
package details;


public class Students {
   
    private String name;
    private String email;
    private String cell;
    private int age;
    private boolean gender;

    public Students() {
    }

    public Students(String name, String email, String cell, int age, boolean gender) {
        this.name = name;
        this.email = email;
        this.cell = cell;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" + "name=" + name + ", email=" + email + ", cell=" + cell + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
    
    
    
}

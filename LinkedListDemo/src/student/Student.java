
package student;


public class Student {
  private String name;
  private String ClassName;
  private int id;

    public Student() {
    }

    public Student(String name, String ClassName, int id) {
        this.name = name;
        this.ClassName = ClassName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", ClassName=" + ClassName + ", id=" + id + '}';
    }
  
  
}


package generics;


public class Student<E> {
  private E name;
  private E id;

    public Student() {
    }

    public Student(E name, E id) {
        this.name = name;
        this.id = id;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }
  
  
  
}

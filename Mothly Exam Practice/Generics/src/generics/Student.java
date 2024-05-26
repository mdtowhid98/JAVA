
package generics;


public class Student<E,F,G> {
   private E name;
   private F id;
   private G age;

    public Student() {
    }

    public Student(E name, F id, G age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public F getId() {
        return id;
    }

    public void setId(F id) {
        this.id = id;
    }

    public G getAge() {
        return age;
    }

    public void setAge(G age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }
   
   
}

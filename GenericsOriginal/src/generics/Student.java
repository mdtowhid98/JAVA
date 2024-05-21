
package generics;


public class Student<T,U,V> {
   private T name;
   private U age;
   private V id;

    public Student() {
    }

    public Student(T name, U age, V id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }
   
   
}

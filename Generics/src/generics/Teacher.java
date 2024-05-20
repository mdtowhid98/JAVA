
package generics;



public class Teacher<E> extends Student<E>{
  private E name;
  private E id;
  private E age;
  private E salary;

    public Teacher() {
    }

    public Teacher(E age, E salary) {
        this.age = age;
        this.salary = salary;
    }

    public Teacher(E age, E salary, E name, E id) {
        super(name, id);
        this.age = age;
        this.salary = salary;
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

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public E getSalary() {
        return salary;
    }

    public void setSalary(E salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + '}';
    }

   
    
    
  
  
  
}

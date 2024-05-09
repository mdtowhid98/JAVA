
package animal;

public class Dog extends Animal{

    
  private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
       
        
    }

  
  
  
  
}

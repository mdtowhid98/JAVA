
package geomatry;


public  class Geomatry<T> {
  private T color;
  private T filled;

    public Geomatry() {
    }

    public Geomatry(T color, T filled) {
        this.color = color;
        this.filled = filled;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public T getFilled() {
        return filled;
    }

    public void setFilled(T filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geomatry{" + "color=" + color + ", filled=" + filled + '}';
    }
  
  public <T> void getArea(){
  
  };
  
  
  
  public <T> void getPerimeter(){
  
  };
  
  
    
    
}

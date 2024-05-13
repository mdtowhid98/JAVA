
package geomatry;

import java.util.Date;


public abstract class Geomatry {
     private String color="white";
  private boolean filled;
  private Date datecreated;

    public Geomatry() {
        this.datecreated = new Date();
    }

   

    public Geomatry(boolean filled, String color) {
        this.filled = filled;
        this.color=color;
        this.datecreated =new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "Geomatry{" + "color=" + color + ", filled=" + filled + ", datecreated=" + datecreated + '}';
    }
  
  public abstract double getArea();
  public abstract double getPerimeter();
    
}


package geomatry;

import java.util.Date;


public abstract class Geomatry {
    private String color="Black";
    private boolean filled;
    private Date createDate;

    public Geomatry() {
        this.createDate =new Date();
    }

    public Geomatry(boolean filled, Date createDate) {
        this.filled = filled;
        this.createDate = createDate;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Geomatry{" + "color=" + color + ", filled=" + filled + ", createDate=" + createDate + '}';
    }

    public abstract double getArea(); 
    public abstract double getPerimeter(); 
    
    
}

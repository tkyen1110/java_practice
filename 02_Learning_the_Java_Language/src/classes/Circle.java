package classes;

public class Circle {
    private int x, y, radius;
    
    public Circle(int xValue, int yValue, int rValue) {
        x = xValue;
        y = yValue;
        radius =rValue;
    }
    
    public void setOrigin(int xValue, int yValue, int rValue) {
        x = xValue;
        y = yValue;
        radius = rValue;
    }
    
    public void setX(int xValue) {
        x = xValue;
    }
        
    public int getX() {
        return x;
    }
    
    public void setY(int yValue) {
        y = yValue;
    }
        
    public int getY() {
        return y;
    }
    
    public void setR(int rValue) {
        radius = rValue;
    }
        
    public int getR() {
        return radius;
    }
}

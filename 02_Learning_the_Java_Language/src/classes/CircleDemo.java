package classes;

public class CircleDemo {
    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new reference to circle
        circle = new Circle(0, 0, 0);
    }
    
    public static void main(String[] args) {
        Circle myCircle = new Circle(3, 5, 7);
        System.out.println("x:" + myCircle.getX() + " y:" + myCircle.getY()
                          + " radius:" + myCircle.getR());
        moveCircle(myCircle, 1, 2);
        System.out.println("x:" + myCircle.getX() + " y:" + myCircle.getY()
                          + " radius:" + myCircle.getR());
    }
}

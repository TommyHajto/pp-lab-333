import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(1.0, 2.0), 3.0);
        circles[1] = new ColoredCircle(new Point(2.0, 3.0), 4.0, "red");
        circles[2] = new Circle(new Point(3.0, 4.0), 5.0);
        
      
        // for (Circle circle : circles) {
            
        //     System.out.println("Area: " + circle.getArea());
            
           
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle; 
                System.out.println("Color: " + coloredCircle.getColor());
            }
        }
    }
}
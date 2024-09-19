import java.util.*;
abstract class Shape
{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double r)
    {
        radius = r;
        
    }
    double area()
    {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double l ,double w){
        length=l;
        width=w;
    }
        double area()
        {
           return length*width;
        }
    
}
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(4, 3);

    
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

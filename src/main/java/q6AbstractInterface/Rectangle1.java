package q6AbstractInterface;

abstract class Shape1 {
    int b = 20;

    abstract public void calculateArea();
}

public class Rectangle1 extends Shape1 {

    public void calculateArea() {
        System.out.println("\n ===|Extent_Shape_1|==");      
        System.out.println("Area is " + (b * b));
        System.out.println("\n ===|Extent_Shape_2|==");
    }

    public static void main(String args[]) {
        Rectangle1 obj = new Rectangle1();
        obj.b = 200;
        obj.calculateArea();
    }
}
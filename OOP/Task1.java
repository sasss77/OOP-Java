<<<<<<< HEAD
class RectangleClass {
    private int length, breadth;
    public int area;
    int perimeter;

    void setLength(int length) {
        this.length = length;
    }

    void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int calculateArea() {
        area = length * breadth;
        return area;
    }

    public int calculatePerimeter() {
        perimeter = 2 * (length + breadth);
        return (perimeter);
    }
}

public class Task1 {
    public static void main(String[] args) {
        RectangleClass o1 = new RectangleClass();
        o1.setLength(10);
        o1.setBreadth(2);
        System.out.println("The area of rectangle is " + o1.calculateArea());
        System.out.println("The perimeter of rectangle is " + o1.calculatePerimeter());

    }
=======
public class Task1 {
    public static void main(String[] args)
    {
        // System.out.println("+");
        // System.out.println("++");
        // System.out.println("+++");
        // System.out.println("++++");
        // System.out.println("+++++");
        // System.out.println("++++++\n\n\n");

        System.out.println("+\n++\n+++\n++++\n+++++");
        
        System.out.println("Java\"s Object Oriented Language\nIs very featureful\nIt\'s very fast, secure.");
        
    }
    
>>>>>>> 43c8165072b291ec027eccff0d46ec3188b0b968
}

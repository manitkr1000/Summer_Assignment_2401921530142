//  Q1: Interface Test and Arithmetic class
interface Test {
    int square(int x);
}

class Arithmetic implements Test {
    public int square(int x) {
        return x * x;
    }
}

class ToTestInt {
    public void showSquare() {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square of 5 = " + obj.square(5));
    }
}

// Q2: Outer and Inner class
class Outer {
    void display() {
        System.out.println("This is Outer class display method");
    }

    class Inner {
        void display() {
            System.out.println("This is Inner class display method");
        }
    }
}

// Q3: Point class
class Point {
    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

// Q4: Box and Box3D
class Box {
    double length, breadth;

    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    double height;

    Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Q1
        System.out.println("Q1 Output:");
        ToTestInt t = new ToTestInt();
        t.showSquare();

        // Q2
        System.out.println("\nQ2 Output:");
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Q3
        System.out.println("\nQ3 Output:");
        Point p1 = new Point();
        p1.displayPoint();

        Point p2 = new Point(10, 20);
        p2.displayPoint();

        p2.setXY(30, 40);
        p2.displayPoint();

        // Q4
        System.out.println("\nQ4 Output:");
        Box b = new Box(5, 4);
        System.out.println("Area of Box = " + b.area());

        Box3D b3 = new Box3D(5, 4, 3);
        System.out.println("Volume of Box3D = " + b3.volume());
    }
}

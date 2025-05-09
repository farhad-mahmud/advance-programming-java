class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}

class Quadrilateral {
    private Point p1, p2, p3, p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }
    public Point getP4() { return p4; }
}


class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double area() {
        double a = getP1().getY();
        double b = getP2().getY();
        double c = getP3().getY();
        double d = getP4().getY();

        double height = Math.abs(a - c);
        double base1 = Math.abs(getP1().getX() - getP2().getX());
        double base2 = Math.abs(getP3().getX() - getP4().getX());

        return (0.5 * (base1 + base2) * height);
    }
}

class Parallelogram extends Trapezoid {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double area() {
        double base = Math.abs(getP1().getX() - getP2().getX());
        double height = Math.abs(getP1().getY() - getP3().getY());
        return base * height;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double area() {
        double length = Math.abs(getP1().getX() - getP2().getX());
        double width = Math.abs(getP2().getY() - getP3().getY());
        return length * width;
    }
}

class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double area() {
        double side = Math.abs(getP1().getX() - getP2().getX());
        return side * side;
    }
}


public class Shape2 {
    public static void main(String[] args) {

        Square square = new Square(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 4),
                new Point(0, 4)
        );
        System.out.println("Square Area: " + square.area());


        Rectangle rectangle = new Rectangle(
                new Point(0, 0),
                new Point(6, 0),
                new Point(6, 3),
                new Point(0, 3)
        );
        System.out.println("Rectangle Area: " + rectangle.area());


        Parallelogram parallelogram = new Parallelogram(
                new Point(0, 0),
                new Point(5, 0),
                new Point(4, 3),
                new Point(-1, 3)
        );
        System.out.println("Parallelogram Area: " + parallelogram.area());


        Trapezoid trapezoid = new Trapezoid(
                new Point(0, 0),
                new Point(6, 0),
                new Point(4, 3),
                new Point(2, 3)
        );
        System.out.println("Trapezoid Area: " + trapezoid.area());
    }
}

//base class
class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}


class TwoDimensionalShape extends Shape {
    public void display() {
        System.out.println("This is a two-dimensional shape.");
    }
}


class ThreeDimensionalShape extends Shape {
    public void display() {
        System.out.println("This is a three-dimensional shape.");
    }
}

class Circle extends TwoDimensionalShape {
    public void display() {
        System.out.println("This is a circle.");
    }
}

class Rectangle extends TwoDimensionalShape {
    public void display() {
        System.out.println("This is a rectangle.");
    }
}

class Square extends TwoDimensionalShape {
    public void display() {
        System.out.println("This is a square.");
    }
}

class Triangle extends TwoDimensionalShape {
    public void display() {
        System.out.println("This is a triangle.");
    }
}



class Sphere extends ThreeDimensionalShape {
    public void display() {
        System.out.println("This is a sphere.");
    }
}

class Cube extends ThreeDimensionalShape {
    public void display() {
        System.out.println("This is a cube.");
    }
}

class Cylinder extends ThreeDimensionalShape {
    public void display() {
        System.out.println("This is a cylinder.");
    }
}

class Pyramid extends ThreeDimensionalShape {
    public void display() {
        System.out.println("This is a pyramid.");
    }
}


public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape s = new Shape();  // create an object (s) of shape class
        s.display();

        TwoDimensionalShape td = new TwoDimensionalShape(); // td = object ;
        td.display();

        ThreeDimensionalShape thd = new ThreeDimensionalShape();
        thd.display();

        Circle c = new Circle();
        c.display();

        Square sq = new Square();
        sq.display();

        Sphere sp = new Sphere();
        sp.display();

        Cube cu = new Cube();
        cu.display();
    }
}

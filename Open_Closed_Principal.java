//****************************************************************************
// Title : Illustrating the Open/Closed Principle (OCP)
// Author: Sadia Afrin Tamanna
//         Undergraduate Scholar
//         Khulna University
//****************************************************************************

/**
 * Represents a geometric shape with a method to compute its area.
 * This interface establishes the protocol for shapes and mandates implementations to offer an area calculation method.
 */
interface AreaComputable {
    /**
     * Determines the area of the geometric shape.
     *
     * @return The area of the geometric shape.
     */
    double calculateArea();
}

/**
 * Represents a rectangular geometric shape.
 */
class RectangularShape implements AreaComputable {
    private double width;
    private double height;

    /**
     * Constructs a new rectangle geometric shape with the specified width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public RectangularShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

/**
 * Represents a circular geometric shape.
 */
class CircularShape implements AreaComputable {
    private double radius;

    /**
     * Constructs a new circle geometric shape with the given radius.
     *
     * @param radius The radius of the circle.
     */
    public CircularShape(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Computes the total area of geometric shapes.
 */
class TotalAreaCalculator {
    /**
     * Computes the aggregate area of an array of geometric shapes.
     *
     * @param shapes The array of geometric shapes.
     * @return The total area of all geometric shapes.
     */
    public double computeTotalArea(AreaComputable[] shapes) {
        double totalArea = 0;
        for (AreaComputable shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

/**
 * Demonstrates the utilization of geometric shapes and area computation.
 */
class OCPDemo {
    public static void main(String[] args) {
        AreaComputable[] shapes = {
                new RectangularShape(5, 4),
                new CircularShape(3)
        };

        TotalAreaCalculator calculator = new TotalAreaCalculator();
        double totalArea = calculator.computeTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}

/*
In the above example, the TotalAreaCalculator class remains unmodifiable but is amenable to expansion.
It can interact with any new geometric shapes that fulfill the AreaComputable interface
without necessitating alterations to its existing code, adhering to the Open/Closed Principle (OCP).
*/

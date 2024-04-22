//****************************************************************************
// Title : Illustrating the Liskov Substitution Principle (LSP)
// Author: Sadia Afrin Tamanna
//         Undergraduate Student
//         Khulna University
//****************************************************************************

/*
 * Represents a shape with a method to calculate its area.
 * This interface defines the contract for shapes and requires implementations to provide an area calculation method.
 */
interface AreaCalculable {
    /**
     * Computes the area of the shape.
     *
     * @return The area of the shape.
     */
    double computeArea();
}

/*
 * Represents a rectangle shape.
 * This class implements the AreaCalculable interface and calculates the area of a rectangle.
 */
class RectangularShape implements AreaCalculable {
    private double width;
    private double height;

    /**
     * Constructs a new rectangle with the given width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public RectangularShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }
}

/*
 * Represents a square shape, a special case of a rectangle.
 * This class implements the AreaCalculable interface and calculates the area of a square.
 */
class SquareShape implements AreaCalculable {
    private double sideLength;

    /**
     * Constructs a new square with the given side length.
     *
     * @param sideLength The length of each side of the square.
     */
    public SquareShape(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double computeArea() {
        return sideLength * sideLength;
    }
}

/*
 * Computes the total area of shapes.
 * This class provides functionality to calculate the total area of an array of shapes.
 */
class TotalAreaCalculator {
    /*
     * Calculates the total area of an array of shapes.
     *
     * @param shapes The array of shapes.
     * @return The total area of all shapes.
     */
    public double calculateTotalArea(AreaCalculable[] shapes) {
        double totalArea = 0;
        for (AreaCalculable shape : shapes) {
            totalArea += shape.computeArea();
        }
        return totalArea;
    }
}

/*
 * Demonstrates the usage of shapes and area calculation.
 * This class contains the main method to demonstrate the calculation of total area using shapes.
 */
class LSPDemo {
    public static void main(String[] args) {
        AreaCalculable[] shapes = {
                new RectangularShape(5, 4),
                new SquareShape(3)
        };

        TotalAreaCalculator calculator = new TotalAreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}

/*
Both RectangularShape and SquareShape classes implement the AreaCalculable interface, maintaining the Liskov Substitution Principle.
The SquareShape class, a subtype of RectangularShape, can be substituted for a RectangularShape without affecting program correctness.
*/

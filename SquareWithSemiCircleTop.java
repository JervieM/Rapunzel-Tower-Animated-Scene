/**
 SquareWithSemiCircleTop class is a subclass of the Square class that represents a filled square with a semicircle on top.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method
 of the Square class to draw a semicircle on top of the square using the Circle class, which is another DrawingObject implementation.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.Graphics2D;

public class SquareWithSemiCircleTop extends Square {
    private int diameter, x, y, r, g, b;

    public SquareWithSemiCircleTop(int x, int y, int width, int height, int r, int g, int b) {
        super(x, y, width, height, r, g, b);
        diameter = width;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // Call the draw method of the superclass to draw the square
        super.draw(g2d);
        // Calculate the position and diameter of the semicircle
        int circleDiameter = diameter;
        int circleX = x;
        int circleY = y - (diameter / 2);
        // Create a new Circle object and draw it
        Circle circle = new Circle(circleX, circleY, circleDiameter, r, g, b);
        circle.draw(g2d);
    }
}

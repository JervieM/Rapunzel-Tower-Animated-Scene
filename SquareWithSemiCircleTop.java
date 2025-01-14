/**
 SquareWithSemiCircleTop class is a subclass of the Square class that represents a filled square with a semicircle on top.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method
 of the Square class to draw a semicircle on top of the square using the Circle class, which is another DrawingObject implementation.
 @author Jervie S. Manabat (223961)
 @version March 6,2023
 **/
/*
I have not discussed the Java language code in my program
with anyone other than my instructor or the teaching assistants
assigned to this course.
I have not used Java language code obtained from another student,
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program
was obtained from another source, such as a textbook or website,
that has been clearly noted with a proper citation in the comments
of my program.
*/

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
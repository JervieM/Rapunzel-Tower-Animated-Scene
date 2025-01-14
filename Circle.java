/**
 Circle class is a class the implements DrawingObject and creates a circle with a given diameter and color
 at a given position. The circle can be moved to the right and its new x-coordinate can be set.
 This class implements DrawingObject.
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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle implements DrawingObject {
    private int x, y, diameter, r, g, b;
    public Circle(int x, int y, int diameter, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Method to draw the circle object on a Graphics2D object
    @Override
    public void draw(Graphics2D g2d) {
        // Set the color of the circle to the specified RGB values
        g2d.setColor(new Color(r,g,b));
        // Create a new Ellipse2D.Double object with the specified x and y coordinates, diameter, and diameter
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
        // Fill the Ellipse2D.Double object with the specified color
        g2d.fill(circle);
    }
    // Method to move the circle object to the right by a certain amount
    public void moveRight(int dx) {
        // Add the specified amount to the x-coordinate of the circle
        x += dx;
        // Set the new x-coordinate of the circle
        this.setX(x);
    }
    // Method to set the x-coordinate of the circle
    public void setX(int x) {
        this.x = x;
    }
}

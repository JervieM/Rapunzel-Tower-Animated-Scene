/**
 Triangle class implements the DrawingObject interface and creates a triangle of a specified size and color.
 It also has a "draw" method to draw the triangle using the "Graphics2D" object.
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

import java.awt.*;

public class Triangle implements DrawingObject {
    private int x, y, width, height, r, g, b;

    public Triangle (int x, int y, int width, int height, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // Set the color of the Triangle using the RGB values
        g2d.setColor(new Color(r,g,b));
        // Define the x and y coordinates of the three points of the Triangle
        int[] xPoints = {x, x + width, x + width / 2};
        int[] yPoints = {y + height, y + height, y};
        // Draw the Triangle using the x and y coordinates of the three points
        g2d.fillPolygon(xPoints, yPoints, 3);
    }
}


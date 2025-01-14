/**
 Line class creates a line segment with a specified start and end point.
 The lines' thickness, and color are can be made in this class.
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

import java.awt.*;
public class Line implements DrawingObject {
    private int startX, startY, endX, endY, thickness, r, g, b;

    public Line(int startX, int startY, int endX, int endY, int thickness, int r, int g, int b) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.thickness = thickness;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // The draw method draws a line using the specified parameters
    @Override
    public void draw(Graphics2D g2d) {
        // Set the color of the line
        g2d.setColor(new Color(r, g, b));
        // Set the thickness of the line
        g2d.setStroke(new BasicStroke(thickness));
        // Draw the line from start point to end point
        g2d.drawLine(startX, startY, endX, endY);
    }
}
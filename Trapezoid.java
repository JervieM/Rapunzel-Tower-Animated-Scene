/**
 Trapezoid class is an implementation of the DrawingObject interface that represents a filled trapezoid with a given position, size, and color.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method of the DrawingObject
 interface to draw the trapezoid using the Graphics2D object passed as an argument.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;
public class Trapezoid implements DrawingObject {
    private int x, y, topWidth, bottomWidth, height, r, g, b;

    public Trapezoid(int x, int y, int topWidth, int bottomWidth, int height, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.topWidth = topWidth;
        this.bottomWidth = bottomWidth;
        this.height = height;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // Define the x and y points of the polygon
        int[] xPoints = {x, x + topWidth, x + bottomWidth, x + bottomWidth - topWidth};
        int[] yPoints = {y, y, y + height, y + height};
        // Set the color of the polygon to the specified RGB values
        g2d.setColor(new Color(r, g, b));
        // Fill the polygon with the specified color
        g2d.fillPolygon(xPoints, yPoints, 4);
    }
}

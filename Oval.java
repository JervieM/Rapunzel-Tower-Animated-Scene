/**
 Oval class creates an oval shape object.
 The object has specified position, size, and color, and
 can be moved horizontally or vertically.
 This class implements DrawingObject.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Oval implements DrawingObject {
    private int x, y, width, height, r, g, b;

    public Oval(int x, int y, int width, int height, int r, int g, int b) {
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
        // Set the color of the oval
        g2d.setColor(new Color(r,g,b));
        // Create an ellipse
        Ellipse2D.Double oval = new Ellipse2D.Double(x, y, width, height);
        // Fill the ellipse with the set color
        g2d.fill(oval);
    }
    // Move the oval to the right
    public void moveRight(int dx) {
        // Update the x-coordinate of the oval
        x += dx;
        // Set the new x-coordinate of the oval
        this.setX(x);
    }
    // Move the oval up
    public void moveUp(int dy) {
        // Update the y-coordinate of the oval
        y -= dy;
        // Set the new y-coordinate of the oval
        this.setY(y);
    }

    // Move the oval down
    public void moveDown(int dy) {
        // Update the y-coordinate of the oval
        y += dy;
        // Set the new y-coordinate of the oval
        this.setY(y);
    }

    // Set the x-coordinate of the oval
    public void setX(int x) {
        this.x = x;
    }

    // Set the y-coordinate of the oval
    public void setY(int y) {
        this.y = y;
    }
}

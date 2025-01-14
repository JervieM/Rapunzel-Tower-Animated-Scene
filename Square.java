/**
 Square class is an implementation of the DrawingObject interface that represents a filled square with a given position, size, and color.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method of the DrawingObject
 interface to draw the square using the Graphics2D object passed as an argument.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;

public class Square implements DrawingObject {
    private int x, y, width, height, r, g, b;

    public Square(int x, int y, int width, int height, int r, int g, int b) {
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
        g2d.setColor(new Color(r,g,b)); // set the color of the graphic context to the specified color
        g2d.fillRect(x, y, width, height); // draw a filled rectangle with the specified dimensions and color
    }
}


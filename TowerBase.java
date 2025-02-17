/**
 TowerBase class is an implementation of the DrawingObject interface that represents a tower base made up of two squares and two triangles of the same color.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method of the DrawingObject interface
 to draw the tower base using the Graphics2D object passed as an argument.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;

public class TowerBase implements DrawingObject {
    private Square topSquare, bottomSquare;
    private Triangle leftTriangle, rightTriangle;

    public TowerBase(int x, int y, int topWidth, int bottomWidth, int height, int r, int g, int b) {
        // calculate x-coordinate of top square so it's centered on the bottom square
        int topX = x + (bottomWidth - topWidth) / 2;
        // calculate y-coordinate of bottom square
        int bottomY = y + height;
        // create top and bottom squares and left and right triangles
        this.topSquare = new Square(topX, y, topWidth, height, r, g, b);
        this.bottomSquare = new Square(x, bottomY, bottomWidth, height, r, g, b);
        this.leftTriangle = new Triangle(x, bottomY, topWidth, height, r, g, b);
        this.rightTriangle = new Triangle(x + bottomWidth - topWidth, bottomY, topWidth, height, r, g, b);
    }

    @Override
    public void draw(Graphics2D g2d) {
        // draw all components of the tower base
        topSquare.draw(g2d);
        bottomSquare.draw(g2d);
        leftTriangle.draw(g2d);
        rightTriangle.draw(g2d);
    }
}

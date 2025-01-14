/**
 Cloud class is a drawing object that creates a cloud consisting of three shapes: two ovals and a circle.
 The cloud can be moved to the right, and if it goes off the right side of the canvas, it will wrap around
 to the left side. The cloud is created with a given color and position.
 This class implements DrawingObject.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;

public class Cloud implements DrawingObject {
    private Oval oval1, oval2;
    private Circle circle1;
    private int x, width, r, g, b;
    private SceneCanvas canvas;
    // Constructor method that initializes the Cloud object with ovals and circles
    public Cloud(int x, int y, int width, int height, int r, int g, int b, SceneCanvas canvas) {
        // Initialize instance variables with oval and circle objects
        oval1 = new Oval(x - 20, y + 10, width + 10, height, r, g, b);
        circle1 = new Circle(x - height / 2, y + height / 4, height - 20, r, g, b);
        oval2 = new Oval(x + width / 4, y + height / 4, width, height - 20, r, g, b);
        // Assign remaining instance variables with passed-in values
        this.width = width;
        this.x = x;
        this.r = r;
        this.g = g;
        this.b = b;
        this.canvas = canvas;
    }
    // Draw the Cloud object on the Graphics2D object
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(r, g, b)); // set the color of the Graphics2D object to the Cloud's color
        oval1.draw(g2d); // draw oval1
        circle1.draw(g2d); // draw circle1
        oval2.draw(g2d); // draw oval2
    }
    // Move the Cloud object to the right by a certain amount
    public void moveRight(int dx) {
        x += dx; // update the x-coordinate of the Cloud object
        if (x > canvas.getWidth()) { // if the Cloud object moves off the canvas to the right
            x = -width; // reset the x-coordinate to be the leftmost point of the Cloud object
            oval1.setX(x - 20); // set the x-coordinate of oval1 to the leftmost point of the Cloud object
            circle1.setX(x - width / 2); // set the x-coordinate of circle1 to the leftmost point of the Cloud object
            oval2.setX(x + width / 4); // set the x-coordinate of oval2 to the leftmost point of the Cloud object
        }
        oval1.moveRight(dx); // move oval1 to the right by the specified amount
        circle1.moveRight(dx); // move circle1 to the right by the specified amount
        oval2.moveRight(dx); // move oval2 to the right by the specified amount
    }
}




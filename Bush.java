/**
 Bush class implements the DrawingObject interface and creates an array of circles of random positions and colors to represent a bush.
 It also has a "draw" method to draw the bush using the "Graphics2D" object.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.Graphics2D;

public class Bush implements DrawingObject {
    private Circle[] circles;
    // Constructor for Bush class, creates an array of Circle objects
    public Bush(int x, int y, int diameter, int numCircles, int r, int g, int b) {
        circles = new Circle[numCircles];
        int offset = diameter / 2;
        for (int i = 0; i < numCircles; i++) {
            // Randomize the x and y position of the Circle object within the diameter
            int xPos = x + (int) (Math.random() * diameter) - offset;
            int yPos = y + (int) (Math.random() * diameter) - offset;
            // Create a new Circle object with the randomized position and specified color
            circles[i] = new Circle(xPos, yPos, diameter, r, g, b);
        }
    }

    // Method to draw the bush object on a Graphics2D object
    public void draw(Graphics2D g2d) {
        // Loop through the array of Circle objects and draw each one using the Circle.draw() method
        for (Circle circle : circles) {
            circle.draw(g2d);
        }
    }
}

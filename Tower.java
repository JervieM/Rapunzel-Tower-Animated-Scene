/**
 Tower class is an implementation of the DrawingObject interface that represents a tower made up of a square and two triangles of different colors.
 This class has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method of the
 DrawingObject interface to draw the tower using the Graphics2D object passed as an argument.
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

public class Tower implements DrawingObject {
    private int x, y, width, height, r1, g1, b1, r2, g2, b2;

    public Tower(int x, int y, int width, int height, int r1, int g1, int b1, int r2, int g2, int b2) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r1 = r1;
        this.g1 = g1;
        this.b1 = b1;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // method to draw the Tower object using the given graphics context
        // calculate dimensions for the square and triangle components
        int squareWidth = width - 50;
        int squareHeight = height * 2 / 8;
        int triangleHeight = height / 3;
        // create Square and Triangle objects to compose the Tower
        DrawingObject square = new Square(x + (width - squareWidth) / 2, y + triangleHeight, squareWidth, squareHeight, r1, g1, b1);
        DrawingObject triangle = new Triangle(x, y + triangleHeight - triangleHeight, width, triangleHeight, r2, g2, b2);
        // draw the Square and Triangle objects
        square.draw(g2d);
        triangle.draw(g2d);
    }
}


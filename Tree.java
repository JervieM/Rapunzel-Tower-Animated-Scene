/**
 Tree class implements DrawingObject interface and represents a tree made up of a rectangle and a triangle of different colors.
 It has a constructor that takes the position, size, and color values as input parameters, and it overrides the draw method of the
 DrawingObject interface to draw the tree using the Graphics2D object passed as an argument.
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

public class Tree implements DrawingObject {
    private int x, y, width, height, r, g, b, r2, g2, b2;

    public Tree(int x, int y, int width, int height, int r, int g, int b, int r2, int g2, int b2) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r = r;
        this.g = g;
        this.b = b;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // Draw the trunk
        int trunkWidth = width / 5;
        int trunkHeight = height / 2;
        int trunkX = x + width /2;
        int trunkY = y + height / 4 * 3;
        Square trunk = new Square(trunkX, trunkY, trunkWidth, trunkHeight, r2, g2, b2);
        trunk.draw(g2d);
        // Draw the tree leaves
        int leafWidth = width / 2;
        int leafHeight = height / 2;
        int leafX = x + width / 2 - leafWidth / 2;
        int leafY = y + height / 4 - leafHeight / 2;
        // Draw the first triangle of leaves
        Triangle leaves1 = new Triangle(leafX + leafWidth / 5, leafY, leafWidth, leafHeight, r, g, b);
        leaves1.draw(g2d);
        // Draw the second triangle of leaves
        Triangle leaves2 = new Triangle(leafX + leafWidth / 5, leafY + leafHeight / 2, leafWidth, leafHeight, r, g, b);
        leaves2.draw(g2d);
        // Draw the third triangle of leaves
        Triangle leaves3 = new Triangle(leafX + leafWidth / 5, leafY + leafHeight, leafWidth, leafHeight, r, g, b);
        leaves3.draw(g2d);
    }
}
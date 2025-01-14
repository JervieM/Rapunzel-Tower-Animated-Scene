/**
 Hair class is the class that creates objects that will be animated represents a group
 of braids and is responsible for moving them up and down within a given range.
 This class implements DrawingObject.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;
import java.util.ArrayList;

public class Hair implements DrawingObject {
    private ArrayList<Oval> braids; // ArrayList of Oval objects to represent braids
    private int  y; // current y-coordinate of the hair
    private int  braidHeight; // height of each braid

    // define the range of y coordinates that the hair can move within
    private final int MIN_Y = -764;
    private final int MAX_Y = 80;

    // constructor to initialize hair with braids of given width, height and color
    public Hair(int x, int y, int braidWidth, int braidHeight, int r, int g, int b) {
        this.y = y;
        this.braidHeight = braidHeight;
        braids = new ArrayList<Oval>();
        for (int i = 0; i < 20; i++) {
            braids.add(new Oval(x, y + (i * braidHeight), braidWidth, braidHeight, r, g, b));
        }
    }
    // method to move the hair up
    public void moveUp() {
        // check if the new y coordinate is within the range
        if (y - braidHeight >= MIN_Y) {
            for (Oval braid : braids) {
                braid.moveUp(braidHeight); // move each braid up
            }
            y -= braidHeight; // update the current y-coordinate of the hair
        }
    }
    // method to move the hair down
    public void moveDown() {
        // check if the new y coordinate is within the range
        if (y + braidHeight <= MAX_Y) {
            for (Oval braid : braids) {
                braid.moveDown(braidHeight); // move each braid down
            }
            y += braidHeight; // update the current y-coordinate of the hair
        }
    }
    // method to draw the hair
    @Override
    public void draw(Graphics2D g2d) {
        for (Oval braid : braids) {
            braid.draw(g2d); // draw each braid
        }
    }
}

/**
 DrawingObject interface defines a method called draw that takes a Graphics2D
 object as an argument and has no return value. Classes that implement this
 interface must provide an implementation for this method to perform custom
 drawing on a graphical object.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;

public interface DrawingObject {
    void draw(Graphics2D g2d);
}

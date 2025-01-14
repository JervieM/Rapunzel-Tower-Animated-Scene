/**
 GrassLand class is created through path and creates a grassy landscape with curves and varying shades of green.
 The grass is created with a given color and is fixed in place.
 This class implements DrawingObject.
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
import java.awt.geom.*;

public class GrassLand implements DrawingObject {

    @Override
    public void draw(Graphics2D g2d) {
        // Antialiasing is turned on to smooth out the edges of the graphics.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Path2D.Double path = new Path2D.Double();
        path.moveTo(0.5, 768.9);
        path.lineTo(-0.8, 495.7);
        path.lineTo(149.4, 493.1);
        path.lineTo(353.9, 496.6);
        path.curveTo(406.9, 496.3, 351.7, 486.5, 462.2, 506.1);
        path.lineTo(545.6, 501.2);
        path.curveTo(724.2, 468.0, 667.0, 471.3, 781.4, 464.6);
        path.curveTo(1049.6, 493.0, 1026.6, 449.8, 1072.5, 536.2);
        path.curveTo(1023.6, 767.9, 1041.9, 713.8, 1005.2, 822.0);
        path.lineTo(0.5,767.6);
        // Filled with a color using the Graphics2D object.
        g2d.setColor(new Color (60,179,79));
        g2d.fill(path);

        Path2D.Double path2 = new Path2D.Double();
        path2.moveTo(150.1, 494.6);
        path2.curveTo(150.1, 494.6, 154.7, 485.6, 164.4,478.0);
        path2.curveTo(173.1, 473.0, 180.5, 467.9, 191.0, 462.5);
        path2.curveTo(200.7, 463.4, 216.2, 467.1, 233.0, 467.9);
        path2.curveTo(248.4, 469.0, 258.0, 469.0, 278.0, 465.2);
        path2.curveTo(315.7, 457.6, 356.7, 448.9, 383.6, 448.9);
        path2.curveTo(428.1, 462.9, 440.1, 468.1, 458.1, 472.1);
        path2.curveTo(485.8, 480.8, 505.0, 494.4, 509.2, 500.0);
        path2.curveTo(502.0, 505.8, 482.5, 505.3, 445.1, 508.9);
        path2.curveTo(415.2, 511.9, 406.8, 515.5, 366.4, 513.2);
        path2.curveTo(327.0, 509.1, 310.7, 505.1, 250.3, 505.1);
        path2.curveTo(250.3, 505.1, 215.5, 505.5, 190.3, 499.6);
        path2.moveTo(150.1, 494.6);

        g2d.setColor(new Color (80,189,70));
        g2d.fill(path2);

    }
}
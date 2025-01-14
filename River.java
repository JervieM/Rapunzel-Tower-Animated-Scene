/**
 River class creates a curved path using a Path2D object,
 and draws a custom river shape on the screen with anti-aliasing.
 This class implements DrawingObject.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;
import java.awt.geom.*;

public class River implements DrawingObject {

    @Override
    public void draw(Graphics2D g2d) {
        // Antialiasing is turned on to smooth out the edges of the graphics.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Path2D.Double path = new Path2D.Double();
        path.moveTo(532, 767.7);
        path.curveTo(510.4, 748.4, 489.8, 722.1, 480.2, 691.7);
        path.curveTo(477.6, 670.8, 481.4, 648.3, 491.9, 624.1);
        path.curveTo(507.8, 604.2, 491.9, 624.1, 507.8, 604.2);
        path.curveTo(522.6, 588.4, 539.7, 569.3, 549.8, 552.9);
        path.curveTo(552.5, 533.0, 540.7, 521.2, 523.3, 519.0);
        path.curveTo(499.4, 519.1, 474.8, 519.1, 403.5, 517.9);
        path.curveTo(425.6, 508.0, 456.9, 504.0, 470.7, 503.0);
        path.curveTo(479.4, 503.0, 492.8, 503.0, 505.7, 500.4);
        path.curveTo(467.0, 484.0, 492.7, 482.7, 519.0, 483.5);
        path.curveTo(543.0, 484.8, 574.7, 487.9, 599.0, 489.4);
        path.curveTo(616.5, 492.9, 587.0, 503.6, 603.3, 525.2);
        path.curveTo(601.6, 550.1, 589.5, 574.1, 578.1, 602.6);
        path.curveTo(569.5, 632.3, 574.9, 662.6, 591.2, 683.5);
        path.curveTo(619.4, 711.5, 646.6, 727.4, 667.5, 739.7);
        path.curveTo(698.6, 751.3, 760.7, 768.8, 643.1, 770.2);
        path.lineTo(533.4, 770.2);
        // Filled with a color using the Graphics2D object.
        g2d.setColor(new Color (24,134,176));
        g2d.fill(path);
    }
}

/**
 GradientBackground class is a Swing component that paints a gradient background from a top color to a bottom color.
 The top and bottom colors are fixed, and the size of the component determines the size of the gradient.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/
/*

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class GradientBackground extends JComponent {
    // Define two colors for the gradient background
    private final Color topColor = new Color(148, 180, 255);
    private final Color bottomColor = new Color(255, 255, 255);

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // Create a gradient paint object that uses the two colors defined earlier
        GradientPaint gradient = new GradientPaint(0, 0, topColor, 0, getHeight(), bottomColor);
        // Set the paint of the graphics object to the gradient paint object
        g2d.setPaint(gradient);
        // Fill a rectangle that covers the entire component with the gradient paint
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}

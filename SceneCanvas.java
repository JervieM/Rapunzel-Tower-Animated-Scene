/**
 SceneCanvas class extends JComponent and implements ActionListener and KeyListener,
 and creates and adds various DrawingObject shapes to its sceneShapes ArrayList to
 create a visual scene that can be displayed within a GUI.
 It also contains methods to handle events related to keyboard input and timers.
 @author Jervie S. Manabat 
 @version March 6,2023
 **/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent implements ActionListener, KeyListener {
    private final ArrayList<DrawingObject> sceneShapes;
    private final Timer timer;
    private final Hair hair;

    public SceneCanvas() {
        // Initialize the list of shapes
        sceneShapes = new ArrayList<>();
        // Set the preferred size of the canvas
        setPreferredSize(new Dimension(1024, 768));
        // Add the GradientBackground component to the canvas
        add(new GradientBackground(), 0); // Add it to the bottom of the z-order
        // Add MovingClouds to the list of shapes
        sceneShapes.add(new Cloud(50, 50, 80, 90, 245, 245, 245, this));
        sceneShapes.add(new Cloud(450, 40, 80, 90, 245, 245, 245, this));
        sceneShapes.add(new Cloud(800, 80, 80, 90, 245, 245, 245, this));
        // Add the Tower shapes to the list of shapes
        sceneShapes.add(new Trapezoid(320, 24, 12, 14,4,107,45,145 ));
        sceneShapes.add(new Triangle(298, 18,55, 20, 107,45,145));
        sceneShapes.add(new Square(308, 38, 35, 47, 229,230,188));
        sceneShapes.add(new SquareWithSemiCircleTop(312, 45, 11, 9, 52,41,41));
        sceneShapes.add(new SquareWithSemiCircleTop(327, 45, 11, 9, 52,41,41));
        sceneShapes.add(new Square(426, 36, 15, 47, 103,58,36));
        sceneShapes.add(new Square(426, 45, 15, 5, 52,41,41));
        sceneShapes.add(new Square(426, 55, 15, 5, 52,41,41));
        sceneShapes.add(new Square(426, 65, 15, 5, 52,41,41));
        sceneShapes.add(new TowerBase(338,145,60,80,300,229,230,188));
        sceneShapes.add(new Tower(306, 4, 143, 250, 229,230,188,107,45,145));
        sceneShapes.add(new Line(348,165, 406, 165, 3, 103,58,36));
        sceneShapes.add(new Line(348,165, 348, 151, 3, 103,58,36));
        sceneShapes.add(new Line(406,165, 406, 151, 3, 103,58,36));
        sceneShapes.add(new Line(406,165, 406, 151, 3, 103,58,36));
        sceneShapes.add(new Line(362,165, 362, 151, 3, 103,58,36));
        sceneShapes.add(new Line(362,165, 362, 151, 3, 103,58,36));
        sceneShapes.add(new Line(377,165, 377, 151, 3, 103,58,36));
        sceneShapes.add(new Line(392,165, 392, 151, 3, 103,58,36));
        sceneShapes.add(new Line(332,95, 423, 95, 2, 103,58,36));
        sceneShapes.add(new Line(332,95, 332, 88, 2, 103,58,36));
        sceneShapes.add(new Line(423,95, 423, 88, 2, 103,58,36));
        sceneShapes.add(new Line(345,95, 345, 88, 2, 103,58,36));
        sceneShapes.add(new Line(358,95, 358, 88, 2, 103,58,36));
        sceneShapes.add(new Line(371,95, 371, 88, 2, 103,58,36));
        sceneShapes.add(new Line(384,95, 384, 88, 2, 103,58,36));
        sceneShapes.add(new Line(397,95, 397, 88, 2, 103,58,36));
        sceneShapes.add(new Line(410,95, 410, 88, 2, 103,58,36));
        sceneShapes.add(new SquareWithSemiCircleTop(348, 105, 13, 13, 52,41,41));
        sceneShapes.add(new SquareWithSemiCircleTop(394, 105, 13, 13, 52,41,41));
        sceneShapes.add(new Line(332,148, 422, 148, 4, 85,72,81));
        sceneShapes.add(new Line(332,123, 422, 123, 4, 85,72,81));
        sceneShapes.add(new Line(332,123, 332, 148, 4, 85,72,81));
        sceneShapes.add(new Line(422,123, 422, 148, 4, 85,72,81));
        sceneShapes.add(new Line(354,123, 354, 148, 4, 85,72,81));
        sceneShapes.add(new Line(377,123, 377, 148, 4, 85,72,81));
        sceneShapes.add(new Line(400,123, 400, 148, 4, 85,72,81));
        sceneShapes.add(new Line(332,123, 354, 148, 4, 85,72,81));
        sceneShapes.add(new Line(354,123, 332, 148, 4, 85,72,81));
        sceneShapes.add(new Line(354,123, 377, 148, 4, 85,72,81));
        sceneShapes.add(new Line(377,123, 354, 148, 4, 85,72,81));
        sceneShapes.add(new Line(377,123, 400, 148, 4, 85,72,81));
        sceneShapes.add(new Line(400,123, 377, 148, 4, 85,72,81));
        sceneShapes.add(new Line(400,123, 422, 148, 4, 85,72,81));
        sceneShapes.add(new Line(422,123, 400, 148, 4, 85,72,81));
        sceneShapes.add(new GrassLand());
        sceneShapes.add(new River());
        // Initialize the Hair object
        hair = new Hair(372, -400, 13, 22, 248,202,64);
        sceneShapes.add(hair);
        // Add the Tower shapes to the list of shapes
        sceneShapes.add(new Triangle(318, -25,120, 100, 107,45,145));
        sceneShapes.add(new SquareWithSemiCircleTop(358, 44, 42, 43, 103,58,36));
        sceneShapes.add(new SquareWithSemiCircleTop(362, 46, 34, 35, 41,33,30));
        sceneShapes.add(new Circle(361, 56, 34, 248,202,64));
        // Add the Trees shapes to the list of shapes
        sceneShapes.add(new Tree(380, 430, 120, 150, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(770, 390, 60, 90, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(950, 388, 50, 80, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(140, 395, 70, 100, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(5, 400, 100, 130, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(570, 410, 110, 140, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(180, 450, 150, 180, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(650, 475, 170, 200, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(20, 480, 180, 210, 0, 128, 0, 103,54,30));
        sceneShapes.add(new Tree(820, 430, 120, 150, 0, 128, 0, 103,54,30));
        // Add the Bushes shapes to the list of shapes
        sceneShapes.add(new Bush(0,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(50,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(250,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(280,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(320,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(650,650, 50, 15,29,127,89));
        sceneShapes.add(new Bush(690,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(800,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(850,650, 50, 10,29,127,89));
        sceneShapes.add(new Bush(980,650, 50, 10,29,127,89));
        // Initialize the timer with a delay of 10 milliseconds and attach an ActionListener to it
        timer = new Timer(10, this);
        // Start the timer
        timer.start();
        // Add a KeyListener to the canvas
        addKeyListener(this);
        // Set the canvas to be focusable so that it can receive KeyEvents
        setFocusable(true);
    }

    public void startAnimation() {
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        // Define gradient colors
        Color color1 = new Color(148, 180, 255); // light blue
        Color color2 = new Color(255, 255, 255); // white
        // Define gradient paint
        GradientPaint gradient = new GradientPaint(
                0, 0, color1, 0, getHeight(), color2);
        // Fill background with gradient paint
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        // Draw text
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rapunzel laydown your hair!", 20, 30);
        g2d.drawString("Use Up and Down Arrows to help her.", 20, 45);
        // Paint each shape in the list of shapes
        for (DrawingObject shape : sceneShapes) {
            shape.draw(g2d);
        }
    }
    // Implement the actionPerformed method from ActionListener interface
    // This method is called by the timer on each tick
    public void actionPerformed(ActionEvent e) {
        for (DrawingObject shape : sceneShapes) {
            if (shape instanceof Cloud clouds) {
                clouds.moveRight(1);
            }
        }
        repaint();
    }
    // Implement the keyPressed method from KeyListener interface
    // This method is called when a key is pressed on the keyboard
    @Override
    public void keyPressed(KeyEvent e) {
        // Move the hair object based on the key pressed and repaint the canvas
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hair.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hair.moveDown();
        }
        repaint();
    }
    //Do nothing for this part
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

/**
 SceneFrame class is responsible for creating and managing the main frame that holds the
 graphical user interface (GUI) of the scene. It sets up the frame properties, such as its
 size and title, and adds the SceneCanvas component to it. It also creates and adds the JMenuBar
 to the frame, which contains the "File" and "Help" menus. It also displays the frame to the user.
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

import javax.swing.*;
import java.awt.*;

public class SceneFrame extends JComponent {
    private JFrame frame;
    private JPanel panel;
    private SceneCanvas canvas;

    public SceneFrame() {
        // Initialize the JFrame
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        // Initialize the SceneCanvas
        canvas = new SceneCanvas();
        panel.add(canvas);
        // Start the animation of the SceneCanvas
        canvas.startAnimation();
    }

    public void setUpGUI() {
        // Set up GUI components
        frame.setTitle("Midterm Project - Manabat, Jervie - 223961");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // Set the preferred size of the SceneCanvas
        canvas.setPreferredSize(new Dimension(1024, 768));
        frame.setVisible(true);
    }
}

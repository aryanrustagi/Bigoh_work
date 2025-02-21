import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputSimulator {
    // A flag to control whether the simulation is running.
    private static volatile boolean running = true;

    public static void main(String[] args) {
        // Create a small GUI with a Stop button
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Input Simulator Control");
            JButton stopButton = new JButton("Stop");
            stopButton.addActionListener(e -> {
                running = false;
                System.out.println("Stopping simulation...");
            });
            frame.getContentPane().add(stopButton);
            frame.setSize(200, 100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

        // Run the simulation in a separate thread
        new Thread(() -> {
            try {
                Robot robot = new Robot();
                robot.setAutoDelay(200);

                // Give the user 2 seconds to prepare
                Thread.sleep(2000);

                // Loop until the running flag is set to false
                while (running) {
                    // ---------------------------
                    // Switch apps using Alt+Tab
                    // ---------------------------
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.delay(500); // short delay to allow the OS to register the key press
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_ALT);

                    // Wait a moment before the next action
                    Thread.sleep(1000);
                    if (!running) break;

                    // ---------------------------
                    // Switch tabs using Ctrl+Tab
                    // ---------------------------
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.delay(500);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_CONTROL);

                    if (!running) break;

                    // ---------------------------
                    // Jiggle the mouse pointer
                    // ---------------------------
                    // Get the current mouse position
                    Point originalPosition = MouseInfo.getPointerInfo().getLocation();
                    int originalX = (int) originalPosition.getX();
                    int originalY = (int) originalPosition.getY();

                    // Jiggle the mouse 10 times
                    for (int i = 0; i < 10 && running; i++) {
                        robot.mouseMove(originalX + 10, originalY + 10);
                        robot.delay(100);
                        robot.mouseMove(originalX, originalY);
                        robot.delay(100);
                    }
                }
                System.out.println("Simulation stopped.");
            } catch (AWTException | InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();
    }
}

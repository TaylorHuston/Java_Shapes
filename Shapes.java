
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Simple drawing program.
 * Demonstrates drawing rectangles and ovals.
 * From "Java How To Program, 10/e, Early Objects" - Chapter 5.
 */

public class Shapes extends JPanel {

    private int shapeChoice = 1;
    
    //Constructor
    public Shapes (int userChoice) {
        this.shapeChoice = userChoice;
    }
    
    //Draws a cascade of shapes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < 10; i++) {
            switch(shapeChoice) {
                case 1:
                    g.drawRect(10+i*10, 10+1*10, 50+i*10, 50+i*10);
                    break;
                case 2:
                    g.drawOval(10+i*10, 10+1*10, 50+i*10, 50+i*10);
                    break;
            }
        } 
    }//End paintComponent
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 for rectangle\n" + 
                "Enter 2 for oval");
        
        int shapeChoice = Integer.parseInt(input);  //Convert to integer
        
        Shapes panel = new Shapes(shapeChoice);
        
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
    
}

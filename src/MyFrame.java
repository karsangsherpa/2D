import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame{
MyPanel panel;

    MyFrame() {
MyPanel panel = new MyPanel();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setPreferredSize(new Dimension(500, 500));


this.add(panel);
this.pack();
this.setLocationRelativeTo(null);
this.setVisible(true);


    }

    
}

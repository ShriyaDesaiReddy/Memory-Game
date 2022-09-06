package mem;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Game{
	Game(){
        Board b=new Board();
        b.setPreferredSize(new Dimension(500,500)); //need to use this instead of setSize
        b.setLocation(500, 500);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.pack();
        b.setVisible(true);
    }   
}

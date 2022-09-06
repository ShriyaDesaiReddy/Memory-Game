package mem;
//import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;  
public class ButtonExample extends JFrame {
	public ButtonExample() {
	}  
	 private static final long serialVersionUID = 100L;
    public static void main(String s[]) {  
    	new Test();
        JFrame frame=new JFrame("Memory Match Game");  
        JPanel panel=new JPanel();
        JLabel label=new JLabel("Welcome to the Memory Matching Game! Improve your memory skills and enhace your mind power! Click the button to enter the grid game:");  
        label.setBounds(9,9,1044,14);
        JButton button=new JButton();  
        button.setBounds(1058,5,147,23);
        button.setText("Match numbers");  
        button.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            frame.dispose();
        	            //@SuppressWarnings("unused")
						Game g=new Game();
        	            
        	        }  
        	    }); 
        
        panel.setBackground(Color.yellow);
panel.setLayout(null);
       // ImageIcon icon = new ImageIcon("brain.jpg");
       // frame.add(new JLabel(icon));
        panel.add(label);  
        panel.add(button); 
       // panel.add(button1);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\brain.jpg"));
        lblNewLabel.setBounds(66, 101, 280, 199);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\images.jpg"));
        lblNewLabel_1.setBounds(1020, 116, 280, 169);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\download.jpg"));
        lblNewLabel_2.setBounds(602, 116, 226, 235);
        panel.add(lblNewLabel_2);
       // frame.add(new JLabel(icon));
        frame.setSize(1500, 500);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

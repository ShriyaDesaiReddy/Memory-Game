package mem;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
public class MemoryGameGUI extends JFrame
{
private static final long serialVersionUID = 100L;
private  JButton gameButtons[];
   private  Boolean playRandom;
public MemoryGameGUI()
   {
       super();
       setResizable(false);
       setFocusable(true);
   }
public void createBoard(int numButtons,Boolean playRandom)
   {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500,400);
gameButtons=new JButton[numButtons];
       JPanel panel1=new JPanel();
       panel1.setLayout(new FlowLayout());
       for(int i=0;i<numButtons;i++){
           gameButtons[i] = new JButton();
           gameButtons[i].setPreferredSize(new Dimension(100,100));
           gameButtons[i].setBackground(Color.GRAY);
          panel1.add(gameButtons[i]);
       }
       Container pane=getContentPane();
      pane.add(panel1,BorderLayout.PAGE_START);
       Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
       setLocation(dim.width/2-100,dim.height/2-100);
       pack();
       setVisible(true);
this.playRandom=playRandom;
JOptionPane.showMessageDialog(this,"Welcome to the Memory Game","Welcome",JOptionPane.PLAIN_MESSAGE);
   }
public String playSequence(String[]sequence,double delay)
 {
	 delay*=1000;
int buttonNum=-1;
for(int i=0;i<sequence.length;i++ )
       {
    	   if(playRandom)
{
        	   buttonNum=(int)(Math.random()*gameButtons.length);
           }
           else
           {buttonNum+=1;
               if (buttonNum>gameButtons.length-1)
            	   buttonNum=0;
           }
           try
{Thread.sleep((int)delay);
} catch (InterruptedException ie) {}
           gameButtons[buttonNum].setBackground(new Color(230,204,255));
           gameButtons[buttonNum].setText(sequence[i]);
try
{
 Thread.sleep((int)delay);
} catch (InterruptedException ie) {}

gameButtons[buttonNum].setBackground(Color.GRAY);
gameButtons[buttonNum].setText("");
       }
       JFrame frame=new JFrame();
       String seq=JOptionPane.showInputDialog(frame,"What is the sequence?");
       return seq;
   }
 public boolean tryExit()
   {int n=JOptionPane.showConfirmDialog(this,"Click No to EXIT and try Grid Game and Yes to continue!","Are You Sure?",JOptionPane.YES_NO_OPTION);
if(n==JOptionPane.YES_OPTION )

           return true;
return false;
   }
   public void matched()
{

       JOptionPane.showMessageDialog(this,"You matched!","Congratulations",JOptionPane.PLAIN_MESSAGE);
   }
   public boolean playAgain()
{
int n=JOptionPane.showConfirmDialog(this,"Do you want to play again?","Memory Game",JOptionPane.YES_NO_OPTION);
if(n==JOptionPane.YES_OPTION )

           return true;
return false;
   }
 public void showScore(int score,int rounds)
{

       JOptionPane.showMessageDialog(this,"You scored "+score+" out of "+rounds,"Score Summary",JOptionPane.PLAIN_MESSAGE);
   }
public void tryAgain()
{

       JOptionPane.showMessageDialog(this,"Try again...","Oops",JOptionPane.PLAIN_MESSAGE);
 }
public void quit()
{

       this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
}
   public void open()
{dispose();
	   ButtonExample b=new ButtonExample();
b.setVisible(true);
       //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
   }}

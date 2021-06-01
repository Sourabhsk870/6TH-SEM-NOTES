import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
/*
<applet code=Calc width=200 height=200></applet>
*/
public class Calc extends JApplet implements ActionListener
{
	JLabel jl;
	JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jbc,jbd,jbe,jba,jbs,jbm,jbdiv;

	public void init(){
		getContentPane().setBackground(Color.BLACK);
		try
		{
			SwingUtilities.invokeAndWait(
			new Runnable(){
			public void run(){
			makeGUI();
			}
			});
		}
		catch (Exception e)
		{
			showStatus("Exception:"+e);
		}
	
	}
private void makeGUI(){
setLayout(new FlowLayout());
jl=new JLabel("0",SwingConstants.RIGHT);
jl.setForeground(Color.WHITE);
jl.setPreferredSize(new Dimension(190,30));
Border border=BorderFactory.createLineBorder(Color.RED,2);
jl.setBorder(border);
jb0=new JButton("0");
jb0.setPreferredSize(new Dimension(190,30));

jb1=new JButton("1");
jb2=new JButton("2");
jb3=new JButton("3");
jb4=new JButton("4");
jb5=new JButton("5");
jb6=new JButton("6");
jb7=new JButton("7");
jb8=new JButton("8");
jb9=new JButton("9");
jbc=new JButton("AC");
jbd=new JButton(".");
jbe=new JButton("=");
jba=new JButton("+");
jbs=new JButton("-");
jbm=new JButton("X");
jbdiv=new JButton("/");



add(jl);
add(jbc);
add(jbd);
add(jbe);
add(jba);
add(jb7);
add(jb8);
add(jb9);
add(jbs);
add(jb4);
add(jb5);
add(jb6);
add(jbm);
add(jb1);
add(jb2);
add(jb3);
add(jbdiv);
add(jb0);
}
public void actionPerformed(ActionEvent ae){}
}

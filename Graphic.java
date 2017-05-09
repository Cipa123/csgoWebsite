package conversion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

//import csgo.JavaSwing1.ListenForButton;

import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class Graphic {
	
	public JFrame frame;
	public JPanel panel, labels;
	public JLabel label;
	public JTextField jt;// = new JTextField(30);
	public String input;
	public JButton jb1, jb2,jb3;
	public int choice = 0;
	
	public Graphic()
	{
		input = "";
		gui();
	}
	
	public void gui()
	{
		
		frame = new JFrame("GAME");
		frame.setVisible(true);
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	//	ImageIcon oneIcon = new ImageIcon("C:\\Users\\mykolas\\workspace\\conversion\\src\\conversion\\pics\\one.png");
	//	jb = new JButton("1", oneIcon);
		//jb.setBorderPainted(false);
	//	jb.setContentAreaFilled(false);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		labels = new JPanel();
		labels.setBackground(Color.white);
		panel.setBackground(Color.white);
	//	panel.setLayout(new GridBagLayout());
		
		
		
		
		label = new JLabel(menuStartScreen(), JLabel.CENTER);
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		label.setFont(font);
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		
		
		ListenForButton lForButton = new ListenForButton();
		
		labels.add(jb1);
		labels.add(jb2);
		labels.add(jb3);
		
		panel.add(label ,BorderLayout.NORTH);
		panel.add(labels, BorderLayout.CENTER);
		
		
		//panel.add(jt);
	
	//	label = new JLabel("<html>TEST <br>  TEST</html>");
		//panel.add(jb);
	/*	jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				choice = 1;
				panel.remove(jb);
				SwingUtilities.updateComponentTreeUI(frame);
			}
		});
		/*jt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = jt.getText();
				label.setText(input);
			}
		});
		*/

	//	panel.add(jb);
		//panel.add(label);
		frame.add(panel);
		
	}
	public void printStuff(String a)
	{
		//clearStuff();
		//SwingUtilities.updateComponentTreeUI(frame);
		label.setText(a);
		SwingUtilities.updateComponentTreeUI(frame);
	
	}
	public void clearStuff()
	{
		label.setText("");
		SwingUtilities.updateComponentTreeUI(frame);
	}
	public void addInput()
	{
		//while(getLength() == 0)
		{
		jt = new JTextField(30);
		panel.add(jt);
		jt.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e)
			{
				while(getLength() == 0)
				{
				String enter = jt.getText();
				setInput(enter);
				}
				removeInput();
			}
		});
	//	panel.add(jt);
		SwingUtilities.updateComponentTreeUI(frame);
		}
	
	}
	public void removeInput()
	{
		panel.remove(jt);
		SwingUtilities.updateComponentTreeUI(frame);

	}
	public void setInput(String b)
	{
		input = b;
	}
	public String getInput()
	{
		return input;
	}
	public int getLength()
	{
		return input.length();
	}
	public void refresh()
	{
		SwingUtilities.updateComponentTreeUI(frame);
	}
	  public String menuStartScreen()
	 	{
		  String b = "";
	 		b +="<html><h1>------------------------------------------------------<br>" +
	 				"Welcome to the Labratory of Hypnogogia!<br>" +
	 				"------------------------------------------------------<br>" +
	 				"I will need to ask you some questions before we begin our procedure<br>"+
	 				"You are cooking with your parents and a hot pipe breaks from the wall and swings into the direction of your mom.<br>"+
	 				"What do you do?<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Step in front of your mom and the hot pipe<br>"+
	 				"2 = Push your mom out of the way<br>"+
	 				"3 = Do Nothing<br>"+
	 				"------------------------------------------------------<br></h1></html>";
	 		
	  	    return b;
	 	}
	  
	  private class ListenForButton implements ActionListener
	  {

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == jb1)
			{
				
			}
			
		}
		  
	  }
}

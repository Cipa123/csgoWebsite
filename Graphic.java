package conversion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;


public class Graphic {
	
	private JFrame frame, menuFrame, normalFrame, sleepParFrame, nightMareFrame;
	private JPanel panel, labels, go;
	private JLabel label, choosen, nightmare, sleeppar, normal;
	private JTextField jt;
	private String input;
	private JButton jb1, jb2,jb3, clickGo;
	private int choice = 0;
	private ImageIcon image1,image2,image3, mare,scary, norm ;

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
	
				//ImageIcon oneIcon = new ImageIcon("\\conversion\\source\\Button 1.png");
				//	 jb = new JButton("1", oneIcon);
				//jb.setBorderPainted(false);
				//	jb.setContentAreaFilled(false);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		labels = new JPanel();
		labels.setBackground(Color.DARK_GRAY);
		panel.setBackground(Color.white);
		
		
		go = new JPanel();
		clickGo = new JButton("Continue");
		clickGo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				end();
				paintMenuScreen();
			}
		});
		go.add(clickGo);
		
		choosen = new JLabel("");
		
		label = new JLabel(menuStartScreen());
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		label.setFont(font);
	
		image1 = new ImageIcon(getClass().getResource("Button 1.png"));
		jb1 = new JButton(image1);
		jb1.setContentAreaFilled(false);
			//jb1.setBorderPainted(false);
		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clickGo.setText("You have choosen one");
			}
		});
		
		image2 = new ImageIcon(getClass().getResource("Button 2.png"));
		jb2 = new JButton(image2);
		jb2.setContentAreaFilled(false);
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clickGo.setText("You have choosen two");
			}
		});
		
		image3 = new ImageIcon(getClass().getResource("Button 3.png"));
		jb3 = new JButton(image3);
		jb3.setContentAreaFilled(false);	
		jb3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clickGo.setText("You have choosen three");
			}
		});
		
		
	
		labels.add(choosen);
		labels.add(jb1);
		labels.add(jb2);
		labels.add(jb3);
		//labels.add(choosen);
	
		panel.add(label ,BorderLayout.NORTH);
		panel.add(labels, BorderLayout.CENTER);
		panel.add(go, BorderLayout.SOUTH);
	
		frame.add(panel);
		frame.repaint();
		
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
		
		
	}

	

	public void end()
	{
		frame.setVisible(false);
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
	 public void paintMenuScreen()
	 {
		 	menuFrame = new JFrame("GAME");
			menuFrame.setVisible(true);
			menuFrame.setSize(1024, 768);
			menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menuFrame.setResizable(false);
			menuFrame.setLocationRelativeTo(null);
			
			
			JPanel masterPanel = new JPanel();
			masterPanel.setLayout(new BorderLayout());
			masterPanel.setBackground(Color.white);
			
			JPanel buttonHolder = new JPanel();
			
			JButton sleepPar = new JButton();
			sleepPar.setText("Sleep Paralysis");
			sleepPar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					paintSleepPar();
				}
			});
			
			JButton nightMare= new JButton();
			nightMare.setText("nightMare");
			nightMare.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					paintNightMare();
				}
			});
			
			JButton normal = new JButton();
			normal.setText("normal");
			normal.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					paintNormal();
				}
			});
			
			buttonHolder.add(sleepPar);
			buttonHolder.add(nightMare);
			buttonHolder.add(normal);
		
			
			masterPanel.add(buttonHolder, BorderLayout.CENTER);
			menuFrame.add(masterPanel);
	 }
	 public void paintNormal()
	 {
		menuFrame.setVisible(false);
		 
		normalFrame = new JFrame("GAME");
		normalFrame.setVisible(true);
		normalFrame.setSize(1024, 768);
		normalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		normalFrame.setResizable(false);
		normalFrame.setLocationRelativeTo(null);
		
		

		norm = new ImageIcon(getClass().getResource("norm.jpg"));
		normal = new JLabel();
		normal.setIcon(norm);
		
		normalFrame.add(normal);
	 }
	 
	 public void paintNightMare()
	 {
		menuFrame.setVisible(false);
		
		nightMareFrame = new JFrame("GAME");
	   	nightMareFrame.setVisible(true);
		nightMareFrame.setSize(1024, 768);
		nightMareFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nightMareFrame.setResizable(false);
		nightMareFrame.setLocationRelativeTo(null);
		
		
		mare= new ImageIcon(getClass().getResource("mar.jpg"));
		
		nightmare = new JLabel();
		nightmare.setIcon(mare);
		
		nightMareFrame.add(nightmare);
		 
	 }
	  
	 public void paintSleepPar()
	 {
		 menuFrame.setVisible(false);
		 
		sleepParFrame = new JFrame("GAME");
		sleepParFrame.setVisible(true);
		sleepParFrame.setSize(1024, 768);
		sleepParFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sleepParFrame.setResizable(false);
		sleepParFrame.setLocationRelativeTo(null);
		

		scary= new ImageIcon(getClass().getResource("scary.jpg"));
		
		sleeppar = new JLabel();
		sleeppar.setIcon(scary);
		
		sleepParFrame.add(sleeppar);
	 }
	  
	  
}

			/* USELESS OLD CRAP
			 * 
			 * public void printStuff(String a)
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
				public void removeInput()
				{
					panel.remove(jt);
					SwingUtilities.updateComponentTreeUI(frame);
				
				}
					/*  private class ListenForButton implements ActionListener
	  			{

	
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == jb1)
						{
							
							label.setText("You have choosen number one");
							Graphic.end();
						
						}
						
					}
					  
				  }
			*
			*
			*/


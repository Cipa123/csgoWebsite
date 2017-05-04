package conversion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class Graphic {
	
	public JFrame frame;
	public JPanel panel;
	public JLabel label;
	public JTextField jt;// = new JTextField(30);
	public String input;
	public JButton jb;
	
	public Graphic()
	{
		input = "";
		gui();
	}
	
	public void gui()
	{
		
		frame = new JFrame("GAME");
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb = new JButton("Enter");
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		
		//panel.add(jt);
	
		label = new JLabel("<html>TEST <br>  TEST</html>");
		
		
		/*jt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = jt.getText();
				label.setText(input);
			}
		});
		*/

	
		panel.add(label);
		frame.add(panel);
		
	}
	public void printStuff(String a)
	{
		//clearStuff();
		//SwingUtilities.updateComponentTreeUI(frame);
		label.setText(a);
		SwingUtilities.updateComponentTreeUI(frame);
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
}

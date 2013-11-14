package hangmanPkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

public class HangmanGUI extends JFrame 
{

	private JPanel hangmanPane;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					HangmanGUI frame = new HangmanGUI();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public HangmanGUI() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);			// I increased the window size here. We can play around with it as needed.
		hangmanPane = new JPanel();
		hangmanPane.setBackground(new Color(240, 240, 240));
		hangmanPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		hangmanPane.setLayout(new BorderLayout(0, 0));
		setContentPane(hangmanPane);
		
		JPanel titlePanel = newTitlePanel();
		hangmanPane.add(titlePanel, BorderLayout.NORTH);
		
		JPanel hangmanPanel = newHangmanPanel();
		hangmanPane.add(hangmanPanel, BorderLayout.EAST);
		{
			JPanel letterPanel = new JPanel();
			hangmanPane.add(letterPanel, BorderLayout.WEST);
			{
				JLabel triedLetterLabel = new JLabel("");
				letterPanel.add(triedLetterLabel);
			}
		}
		{
			JPanel wordPanel = new JPanel();
			hangmanPane.add(wordPanel, BorderLayout.SOUTH);
			{
				JLabel label = new JLabel("_ _ _ _ _ _");
				label.setFont(new Font("Arial", Font.PLAIN, 25));
				wordPanel.add(label);
			}
		}
	}
	
	// This is the title panel.
	
	private JPanel newTitlePanel() 
	{	
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EmptyBorder(5,5,5,5));
		
		JLabel lblHangman = new JLabel("Hangman");
		lblHangman.setFont(new Font("Kristen ITC", Font.ITALIC, 30));
		titlePanel.add(lblHangman);
		return titlePanel;
	}
	
	// This panel will contain everything for our hangman. There isn't much here yet, but we'll add as we go. 
	
	private JPanel newHangmanPanel() 
	{	
		JPanel hangmanPanel = new JPanel();
		{
			JLabel lblHngManImageLabel = new JLabel(" ");
			// This image is just a placeholder for now. We'll need to add all the parts of the hangman as user
			// user input is obtained. The initail gallows image will probably go here though.
			lblHngManImageLabel.setIcon(new ImageIcon(HangmanGUI.class.getResource("1-Hangman.jpg")));
			hangmanPanel.add(lblHngManImageLabel);

		}
		// TODO We need to make the methods for this panel. 
		return hangmanPanel;
	}

}

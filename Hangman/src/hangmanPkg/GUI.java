package hangmanPkg; //DANIEL LEWIS, ANDREW BROWN, CHRIS MCAFEE

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.UIManager;

import java.awt.GridLayout;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblHangman = new JLabel("    Letters Guessed                                             Hangman"); //spaces used for label placement above windows
		lblHangman.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblHangman, BorderLayout.NORTH);
		
		JPanel hangmanPanel = new JPanel();
		contentPane.add(hangmanPanel, BorderLayout.CENTER);
		
		JPanel guessedLettersPanel = new JPanel();
		guessedLettersPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(guessedLettersPanel, BorderLayout.WEST);
		guessedLettersPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JTextArea lettersGuessedArea = new JTextArea("");			 //text area for guessed letters. i can't get text to display BLACK though
		lettersGuessedArea.setLineWrap(true);
		lettersGuessedArea.setRows(1);
		lettersGuessedArea.setBackground(UIManager.getColor("Button.background"));
		lettersGuessedArea.setForeground(Color.BLACK); 				//text doesn't display BLACK. not sure what to do
		lettersGuessedArea.setColumns(1);
		lettersGuessedArea.setEnabled(false);
		lettersGuessedArea.setEditable(false);
		guessedLettersPanel.add(lettersGuessedArea);
		
		JPanel emptySymmetryPanel = new JPanel(); 					//empty panel for symmetry
		emptySymmetryPanel.setBorder(new EmptyBorder(55, 55, 55, 55));
		contentPane.add(emptySymmetryPanel, BorderLayout.EAST);
		
		JPanel wordsPanel = new JPanel();
		contentPane.add(wordsPanel, BorderLayout.SOUTH);
		wordsPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel dashesLabel = new JLabel(""); 						//make a lettersArray that fills in the blanks here
		dashesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wordsPanel.add(dashesLabel);
		
		JPanel lettersPanel = new JPanel();
		lettersPanel.setBorder(new EmptyBorder(10, 25, 60, 25));
		wordsPanel.add(lettersPanel);
		
//add button functionality 
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lettersPanel.add(btnZ);
	}

}

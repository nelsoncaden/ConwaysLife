import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Presents user with grid on which they may click to change any cell states
 * they would like to living. Once satisfied, user must click start and watches
 * how the cell states evolve according to Conway's Game of Life rules. This 
 * class will contain a loop which iterates through each step evolving the 
 * game.
 * @author Caden Nelson
 *
 */
public class Driver extends JFrame {
	
	public int rectSize;
	public int sleepTime;
	
	public Driver() {
		JLabel label1 = new JLabel("Please select the dimensions for the cellular automaton: ");
		JButton button1 = new JButton("25x25");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					rectSize = 625;
				}
			});
		JButton button2 = new JButton("50x50");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					rectSize = 2500;
				}
			});
		JButton button3 = new JButton("100x100");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					rectSize = 10000;
				}
			});
		JLabel label2 = new JLabel("Please select the speed for the cellular automaton: ");
		JButton button11 = new JButton("Slow");
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					sleepTime = 60;
				}
			});
		JButton button22 = new JButton("Medium");
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					sleepTime = 30;
				}
			});
		JButton button33 = new JButton("Fast");
		button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					sleepTime = 10;
				}
			});
		JButton buttonSubmit = new JButton("Ready to Play!");
		buttonSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Driver drive2 = new Driver("go");
				}
			});
		setLayout(new GridLayout(5,1));
		JPanel panel1 = new JPanel(new GridLayout());
		JPanel panel2 = new JPanel(new GridLayout());
		JPanel panel3 = new JPanel(new GridLayout());
		JPanel panel4 = new JPanel(new GridLayout());
		JPanel panel5 = new JPanel(new GridLayout());
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel3.add(label2);
		panel4.add(button11);
		panel4.add(button22);
		panel4.add(button33);
		panel5.add(buttonSubmit);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Welcome to Conway's Game of Life!");
		setVisible(true);
	}
	
	public Driver(String run) {
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Welcome to Conway's Game of Life!");
		setVisible(true);
		frameRunner();
	}
	
	public void frameRunner() {
		while(true) {
			
		}
	}

	public static void main(String[] args) {
		Driver drive = new Driver();
	}

}

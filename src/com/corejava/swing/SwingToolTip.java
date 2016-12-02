package com.corejava.swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Program to create frame with menu bar
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class SwingToolTip {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a Label
		JButton button = new JButton("Save");

		// Attache a Tool Tip 'Label'
		button.setToolTipText("Click here to save File");
		pane.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

}

package com.corejava.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * Program to create frame with menu bar
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class MyWindowBL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("BorderLayout Demo");

		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);

		JPanel pan = (JPanel) frame.getContentPane();

		JButton b1 = new JButton("North");
		pan.add(b1, BorderLayout.NORTH);

		JButton b2 = new JButton("South");
		pan.add(b2, BorderLayout.SOUTH);

		JButton b3 = new JButton("Right");
		pan.add(b3, BorderLayout.EAST);

		JButton b4 = new JButton("West");
		pan.add(b4, BorderLayout.WEST);

		JButton b5 = new JButton("Center");
		pan.add(b5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}

}

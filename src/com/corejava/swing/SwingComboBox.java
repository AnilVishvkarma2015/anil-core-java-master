package com.corejava.swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Program to create frame with menu bar
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class SwingComboBox {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = (JPanel) frame.getContentPane();

		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		JLabel label = new JLabel("Gender : ");
		panel.add(label);

		String gender[] = { "Male", "Female" };
		JComboBox comboBox = new JComboBox(gender);
		panel.add(comboBox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

	}
}
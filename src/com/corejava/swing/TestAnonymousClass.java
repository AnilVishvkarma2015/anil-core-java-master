package com.corejava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Program to create frame with menu bar
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class TestAnonymousClass {

	public static void main(String[] args) {

		JFrame f = new JFrame();

		JButton b = new JButton("Send");
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}

		});

		f.add(b);

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}

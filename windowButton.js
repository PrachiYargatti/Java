package com.p1;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {
	JButton submitButton;
	JButton cancelButton;
	
	public Window() {
		this.setTitle("Components");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		submitButton = new JButton("submit");
		submitButton.setBounds(50, 50, 80, 30);
		this.add(submitButton);
		
		cancelButton = new JButton("cancel");
		cancelButton.setBounds(140, 50, 80, 30);
		this.add(cancelButton);
		
		submitButton.addActionListener(new  ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("submit button clicked");
			}
		});
		
		cancelButton.addActionListener(e -> {
			System.out.println("Cancel Button CLicked");
		});
	}
}

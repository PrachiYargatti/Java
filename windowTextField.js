package com.p2.textfield;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p2.textfield;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame{
	JLabel labelName;
	JTextField textName;
	JButton saveButton;
	
	public Window() {
		super("Label and TextField");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labelName = new JLabel("Name : ");
		textName = new JTextField();
		
		labelName.setBounds(50, 50, 80, 30);
		textName.setBounds(140, 50, 100, 30);
		
		this.add(labelName);
		this.add(textName);
		
		saveButton = new JButton("save");
		saveButton.setBounds(100, 120, 100, 30);
		this.add(saveButton);
		
		saveButton.addActionListener(e -> {
			System.out.println("Name : "+textName.getText());
			textName.setText("");
		});
	}
}

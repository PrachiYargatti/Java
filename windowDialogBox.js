package com.p7.dialogbox;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p7.dialogbox;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window extends JFrame {
	public Window() {
		this.setTitle("DialogBoxes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		showMessageDialogBox();
		showConfirmDialogBox();
		showInputDialogBox();

	}

	public void showMessageDialogBox() {
		JButton msgButton = new JButton("Show Message");
		msgButton.setBounds(50, 50, 150, 30);
		this.add(msgButton);
		msgButton.addActionListener(e -> {
			JOptionPane.showMessageDialog(Window.this, "Hello World..");
		});
	}

	public void showConfirmDialogBox() {
		JButton confirmButton = new JButton("Confirm Button");
		confirmButton.setBounds(50, 100, 150, 30);
		this.add(confirmButton);
		confirmButton.addActionListener(e -> {
			int selection = JOptionPane.showConfirmDialog(Window.this, "Are you sure you want to delete ?");
			if (selection == JOptionPane.YES_OPTION)
				System.out.println("Yes Selected");
			else if (selection == JOptionPane.NO_OPTION)
				System.out.println("No Selected");
			else if (selection == JOptionPane.CANCEL_OPTION)
				System.out.println("Cancel Selected");
		});
	}

	public void showInputDialogBox() {
		JButton inputButton = new JButton("Input Button");
		inputButton.setBounds(50, 150, 150, 30);
		this.add(inputButton);
		inputButton.addActionListener(e -> {
			String name = JOptionPane.showInputDialog(Window.this, "Enter your name ");
			System.out.println("Entered Name - " + name);
		});

	}

}

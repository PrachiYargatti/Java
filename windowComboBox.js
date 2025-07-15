package com.p4.combobox;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p4.combobox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Window extends JFrame{
	JComboBox<String> comboBox;
	
	public Window() {
		super("Combobox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		String[] arr = {"C", "CPP", "JAVA", "Python"};
		//model
		DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>(arr);
		
		//view
		comboBox = new JComboBox<>(defaultComboBoxModel);
		comboBox.setBounds(50, 50, 100, 30);
		this.add(comboBox);
		
		//controller
		comboBox.addItemListener(e -> {
			System.out.println("Fav Language : "+comboBox.getSelectedItem());
		});
	}
}

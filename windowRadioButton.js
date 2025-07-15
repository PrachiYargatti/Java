package com.p3.radiobutton;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p3.radiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Window  extends JFrame{
	JLabel labelGender;
	JRadioButton radioButtonMale;
	JRadioButton radioButtonFemale;
	ButtonGroup radiogroup;
	
	public Window() {
		super("Radio Buttons");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labelGender = new JLabel("Gender : ");
		radioButtonMale = new JRadioButton("Male");
		radioButtonFemale = new JRadioButton("Female");
		
		labelGender.setBounds(50, 50, 80, 30);
		radioButtonMale.setBounds(140, 50, 80, 30);
		radioButtonFemale.setBounds(230, 50, 80, 30);
		
		radiogroup = new ButtonGroup();
		radiogroup.add(radioButtonFemale);
		radiogroup.add(radioButtonMale);
		
		this.add(labelGender);
		this.add(radioButtonMale);
		this.add(radioButtonFemale);
		
		radioButtonMale.addChangeListener(e -> {
			if(radioButtonMale.isSelected()) {
				System.out.println("Male is Selected");
			}
		});
		
		radioButtonFemale.addChangeListener(e -> {
			if(radioButtonFemale.isSelected()) {
				System.out.println("Female is Selected");
			}
		});
		
	}
}

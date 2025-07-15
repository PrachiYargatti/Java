package com.p5.listbox;

public class Program {
	public static void main(String[] args) {
		Window window = new Window();
		window.setSize(900, 600);
		window.setVisible(true);
	}
}

package com.p5.listbox;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Window extends JFrame {
	JList<String> listBox;
	JScrollPane scrollPane;

	public Window() {
		super("ListBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null); // do not apply any layout

		// Model
		DefaultListModel<String> defaultListModel = new DefaultListModel<>();
		defaultListModel.addElement("Idli");
		defaultListModel.addElement("Vade");
		defaultListModel.addElement("Dosa");
		defaultListModel.addElement("Poha");
		defaultListModel.addElement("Upma");
		defaultListModel.addElement("Samosa");
		defaultListModel.addElement("Kachori");

		// View
		listBox = new JList<>(defaultListModel);
		// listBox.setBounds(50, 50, 80, 80);
		// this.add(listBox);

		scrollPane = new JScrollPane(listBox);
		scrollPane.setBounds(50, 50, 80, 80);
		this.add(scrollPane);

		// controller
		listBox.addListSelectionListener(e -> {
			if (e.getValueIsAdjusting())
				System.out.println(listBox.getSelectedValuesList());
		});
	}

}

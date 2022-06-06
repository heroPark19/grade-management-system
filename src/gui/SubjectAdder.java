package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JPanel{
	
	WindowFrame frame;
	
	public SubjectAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
	    panel.setLayout(new SpringLayout());
	
	    JLabel labelname = new JLabel("name : ", JLabel.TRAILING);
	    JTextField fieldname = new JTextField(10);
	    labelname.setLabelFor(fieldname);
	    panel.add(labelname);
	    panel.add(fieldname);
	    
	    JLabel labelgrade = new JLabel("grade : ", JLabel.TRAILING);
	    JTextField fieldgrade = new JTextField(10);
	    labelgrade.setLabelFor(fieldgrade);
	    panel.add(labelgrade);
	    panel.add(fieldgrade);
	    
	    panel.add(new JButton("save"));
	    panel.add(new JButton("cancel"));
	    
	    SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);

	    this.add(panel);
	    this.setVisible(true);
	}
	
	
	
	

}

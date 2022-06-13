package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.SubjectAdderCancelListener;
import listeners.SubjectAdderListener;
import manage.GradeManager;

public class SubjectAdder extends JPanel{
	
	WindowFrame frame;
	GradeManager gradeManager;
	
	public SubjectAdder(WindowFrame frame, GradeManager gradeManager) {
		this.frame = frame;
		this.gradeManager = gradeManager;
		
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
	    
	    JButton saveButton = new JButton("save"); 
	    saveButton.addActionListener(new SubjectAdderListener(fieldname, fieldgrade, gradeManager));
	    
	    JButton cancelButton = new JButton("cancel");
	    cancelButton.addActionListener(new SubjectAdderCancelListener(frame));
	    
	    panel.add(labelgrade);
	    panel.add(fieldgrade);
	    
	    panel.add(saveButton);
	    panel.add(cancelButton);
	    
	    SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);

	    this.add(panel);
	    this.setVisible(true);
	}
	
	
	
	

}

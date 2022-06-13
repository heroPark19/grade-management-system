package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manage.GradeManager;
import subject.Major_requiredSubject;
import subject.Subject;
import subject.SubjectInput;
import subject.SubjectKind;

public class SubjectAdderListener implements ActionListener {
	JTextField fieldname;
	JTextField fieldgrade;
	GradeManager gradeManager;
		
	public SubjectAdderListener(JTextField fieldname, JTextField fieldgrade, GradeManager gradeManager) {
		this.fieldname = fieldname;
		this.fieldgrade = fieldgrade;
		this.gradeManager = gradeManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		SubjectInput subject = new Major_requiredSubject(SubjectKind.Major_required);
		subject.setName(fieldname.getName());
		subject.setGrade(Double.parseDouble(fieldgrade.getText()));
		gradeManager.addsubject(subject);
		putObject(gradeManager, "grademanager");
		subject.printInfo();
	}
	
	public static void putObject(GradeManager gradeManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(gradeManager);
			
			out.close();
			file.close();	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.SubjectViewer;
import gui.WindowFrame;
import manage.GradeManager;

public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GradeManager gradeManager = getObject("grademanager");
		SubjectViewer subjectViewer = frame.getSubjectviewer();
		subjectViewer.setGradeManager(gradeManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(subjectViewer);
		frame.revalidate();
		frame.repaint();
		
	}
	
	public static GradeManager getObject(String filename) {
		GradeManager gradeManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			gradeManager = (GradeManager) in.readObject();
			
			in.close();
			file.close();	
		}
		catch(FileNotFoundException e) {	
			return gradeManager;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return gradeManager;
	}
}

//JButton b = (JButton)e.getSource();
//SubjectViewer viewer = frame.getSubjectviewer(); 
//frame.setupPanel(viewer);

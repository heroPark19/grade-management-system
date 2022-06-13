package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manage.GradeManager;

public class WindowFrame extends JFrame{
	GradeManager gradeManager;
	MenuSelection menuselection ;
	SubjectAdder subjectadder ;
	SubjectViewer subjectviewer;
	

	public WindowFrame(GradeManager gradeManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setTitle("My Frame");
		
		this.gradeManager = gradeManager;
		menuselection = new MenuSelection(this);
        subjectadder = new SubjectAdder(this, this.gradeManager);
		subjectviewer = new SubjectViewer(this, this.gradeManager);
		

		
		this.setupPanel(menuselection);
		 	
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
    public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public SubjectAdder getSubjectadder() {
		return subjectadder;
	}

	public void setSubjectadder(SubjectAdder subjectadder) {
		this.subjectadder = subjectadder;
	}

	public SubjectViewer getSubjectviewer() {
		return subjectviewer;
	}

	public void setSubjectviewer(SubjectViewer subjectviewer) {
		this.subjectviewer = subjectviewer;
	}
}

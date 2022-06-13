package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manage.GradeManager;
import subject.SubjectInput;

public class SubjectViewer extends JPanel{
	
	WindowFrame frame;
	
	GradeManager gradeManager;

	public GradeManager getGradeManager() {
		return gradeManager;
	}

	public void setGradeManager(GradeManager gradeManager) {
		this.gradeManager = gradeManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
	    model.addColumn("grade");
	    
	    for(int i=0; i<gradeManager.size(); i++) {
	    	Vector row = new Vector();
	    	SubjectInput si = gradeManager.get(i);
	    	row.add(si.getName());
	    	row.add(si.getGrade());
	    	model.addRow(row);
	    }
	    
	    JTable table = new JTable (model);
	    JScrollPane sp = new JScrollPane(table);
	    
	    this.add(sp);
	}

	public SubjectViewer(WindowFrame frame, GradeManager gradeManager){
		this.frame = frame;
		this.gradeManager = gradeManager;
		
		System.out.println("***" + gradeManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
	    model.addColumn("grade");
	    
	    for(int i=0; i<gradeManager.size(); i++) {
	    	Vector row = new Vector();
	    	SubjectInput si = gradeManager.get(i);
	    	row.add(si.getName());
	    	row.add(si.getGrade());
	    	model.addRow(row);
	    }
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}

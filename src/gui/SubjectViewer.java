package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manage.GradeManager;

public class SubjectViewer extends JPanel{
	
	WindowFrame frame;
	
	GradeManager gradeManager;

	public SubjectViewer(WindowFrame frame, GradeManager gradeManager){
		this.frame = frame;
		this.gradeManager = gradeManager;
		
		System.out.println("***" + gradeManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
	    model.addColumn("grade");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}

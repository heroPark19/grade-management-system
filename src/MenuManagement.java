import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;


public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");

	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = getObject("grademanager.ser");
		if(gradeManager == null) {
			gradeManager = new GradeManager(input);
		}
		selectMenu(input, gradeManager);
		putObject(gradeManager, "grademanager.ser");
	}
		
	public static void selectMenu(Scanner input, GradeManager gradeManager) {
        int num = -1;
        while(num != 5){
        	try {
		        showMenu();
		        num = input.nextInt();
		        switch(num) {
		        case 1:
		        	gradeManager.addsubject();
		            logger.log("add a subject");
			        break;
	        	case 2:
	    	    	gradeManager.deletesubject();
	    	    	logger.log("delete a subject");
		        	break;
	        	case 3:
		         	gradeManager.Editsubjects();
		         	logger.log("Edit a subject");
		    	    break;
		        case 4:
		        	gradeManager.Viewsubjects();
		        	logger.log("View a list of subject");
		        	break;
		        default :
			        continue;
		       }
          }
          catch(InputMismatchException e) {
        	  System.out.println("Please put an integer between 1 and 5.");
        	  if(input.hasNext()) {
        		  input.next();
        	  }
        	  num = -1; 
          }
	   }
	}
	
	public static void showMenu() {
		System.out.println("1.Add subject");
		System.out.println("2.Delete subject");
		System.out.println("3.Edit subject");
		System.out.println("4.View subjects");
		System.out.println("5.Exist");
		
		System.out.print("Selcet a number : ");
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
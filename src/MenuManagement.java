import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {

	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);
		
		selectMenu(input, gradeManager);
	}
		
	public static void selectMenu(Scanner Input, GradeManager gradeManager) {
        int num = -1;
        while(num != 5){
        	try {
		        showMenu();
		        num = input.nextInt();
		        switch(num) {
		        case 1:
		        	gradeManager.addsubject();
			        break;
	        	case 2:
	    	    	gradeManager.deletesubject();
		        	break;
	        	case 3:
		         	gradeManager.Editsubjects();
		    	    break;
		        case 4:
		        	gradeManager.Viewsubjects();
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
}
import java.util.Scanner;

public class MenuManagement {

	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);
		int num = 0;
		
		
		while(num != 5){
		System.out.println("1.Add subject");
		System.out.println("2.Delete subject");
		System.out.println("3.Edit subject");
		System.out.println("4.View subjects");
		System.out.println("5.Exist");
		
		System.out.print("Selcet a number : ");
		num = input.nextInt();
		
		if (num==1) {
			gradeManager.addsubject();
		}
		else if(num==2) {
			gradeManager.deletesubject();
		}
		else if(num==3) {
			gradeManager.Editsubjects();
		}
		else if(num==4) {
			gradeManager.Viewsubjects();
		}
	    }
	}
	
}
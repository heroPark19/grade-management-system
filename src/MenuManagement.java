import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		while(num != 6){
		System.out.println("1.Add subject");
		System.out.println("2.Delete subject");
		System.out.println("3.Record grade");
		System.out.println("4.Total grade");
		System.out.println("5.Show a menu");
		System.out.println("6.Exist");
		
		System.out.print("Selcet a number : ");
		num = in.nextInt();
		
		if (num==1) {
			addsubject();
		}
		else if(num==2) {
			deletesubject();
		}
		else if(num==3) {
			recordgrade();
		}
		else if(num==4) {
			totalgrade();
		}
		}
	}
	public static void addsubject() {
		Scanner in = new Scanner(System.in);
		System.out.print("Add your subject :");
		String sub = in.next();
		System.out.print("Enter the subject's grade :");
		double sg = in.nextDouble();
	}
	public static void deletesubject() {
		Scanner in = new Scanner(System.in);
		System.out.print("Choose the subject you want to delete :");
		String dsub = in.next();
	}
	public static void recordgrade() {
		Scanner in = new Scanner(System.in);
		System.out.print("Selcect a subject :");
		String ssub = in.nextLine();
		System.out.print("Record your grade :");
		double csub = in.nextDouble();
		System.out.printf("%s subject grade is %d.\n", ssub, csub);
	}
	public static void totalgrade() {
		System.out.println("Your total grade is");
	}
}
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
		
		switch (num) {
		case 1:
			System.out.print("Add your subject :");
			String sub = in.next();
			System.out.print("Enter the subject's grade :");
			double sg = in.nextDouble();
			break;
		case 2:
			System.out.print("Choose the subject you want to delete :");
			String dsub = in.next();
			break;
		case 3:
			System.out.print("Selcect a subject :");
			String ssub = in.nextLine();
			System.out.print("Record your grade :");
			double csub = in.nextDouble();
			System.out.printf("%s subject grade is %d.\n", ssub, csub);
			break;
		case 4:
			System.out.print("Your total grade is");
			break;
		}
		}
	}

}

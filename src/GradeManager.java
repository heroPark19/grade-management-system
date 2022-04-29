import java.util.ArrayList;
import subject.Subject;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class GradeManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Subject subject;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}	
	
	public void addsubject() {
		int kind = 0;
		Subject subject;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Major_required");
			System.out.println("2 for Major_choose");
			System.out.println("Select number for subject kind between 1 and 2 : ");
			kind = input.nextInt();
			if(kind == 1) {
				subject = new Subject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;
			}
			else if(kind == 2) {
				subject = new Subject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;
			}
			else {
				System.out.println("Select number for subject kind between 1 and 2 : ");
			}
		}
	}
	public void deletesubject() {
		System.out.print("Choose the subject you want to delete :");
		String subjectname = input.next();
		int index = -1;
		for (int i=0; i<subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subjectname)) {
			index = i;
			break;
		    }
		}
		
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("The subject " + subjectname + " is deleted.");
		}
		else {
			System.out.println("The subject has not been registered.");
			return;
		}
	}

	public void Editsubjects() {
		System.out.print("Subject name : ");
		String subjectname = input.next();
		for(int i = 0; i<subjects.size(); i++) {
			Subject subject = subjects.get(i);
			if (subject.getName().equals(subject.getName()));{
				int num = -1;
				while(num != 3) {
					System.out.println("** subject info Edit Menu**");
					System.out.println("1. Edit name");
					System.out.println("2. Edit grade");
					System.out.println("3. Exit");
					System.out.println("Select ont number between 1-3 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Subject name : ");
						String name = input.next();
						subject.setName(name);
					}
					else if(num == 2) {
						System.out.print("Subject grade : ");
						double grade = input.nextDouble();
						subject.setGrade(grade);
					}
					else {
						continue;
					}
				}
		    }
			break;
		}
	}
	
	public void Viewsubjects() {
//		System.out.println("Subject name : ");
//		String subjectname = input.next();
		System.out.println("# of registered subjects : " + subjects.size());
		for (int i = 0; i<subjects.size(); i++) {
			subjects.get(i).printInfo();
		}
	}

}

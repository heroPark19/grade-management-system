import java.util.ArrayList;
import java.util.InputMismatchException;
import subject.Liberal_artsSubject;
import subject.Major_chooseSubject;
import subject.Major_requiredSubject;
import subject.Subject;
import subject.SubjectInput;
import subject.SubjectKind;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class GradeManager {
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	Subject subject;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}	
	
	public void addsubject() {
		int kind = 0;
		SubjectInput subjectInput;
		while (kind < 1 || kind > 3) {
			try {
			    System.out.println("1 for Major_required");
			    System.out.println("2 for Major_choose");
			    System.out.println("3 for Liberal_arts");
			    System.out.print("Select number 1, 2, or 3 for subject kind : ");
			    kind = input.nextInt();
			    if(kind == 1) {
				    subjectInput = new Major_requiredSubject(SubjectKind.Major_required);
				    subjectInput.getUserInput(input);
				    subjects.add(subjectInput);
			    	break;
			    }
			    else if(kind == 2) {
				    subjectInput = new Major_chooseSubject(SubjectKind.Major_choose);
				    subjectInput.getUserInput(input);
				    subjects.add(subjectInput);
				    break;
			    }
			    else if(kind == 3) {
			    	subjectInput = new Liberal_artsSubject(SubjectKind.Liberal_arts);
			    	subjectInput.getUserInput(input);
				    subjects.add(subjectInput);
				    break;
		    	}
			    else {
				    System.out.println("Select number for subject kind between 1 and 2 : ");
			    }
			}
			catch(InputMismatchException e) {
				  System.out.println("Please put an integer between 1 and 3.");
	        	  if(input.hasNext()) {
	        		  input.next();
	        	  }
	        	  kind = -1;
			}
		}
	}
	public void deletesubject() {
		System.out.print("Choose the subject you want to delete :");
		String subjectname = input.next();
		int index = findindex(subjectname);
		removefromSubjects(index, subjectname);
	}
	
	public int findindex(String subjectname) {
		int index = -1;
		for (int i=0; i<subjects.size(); i++) {
			if (subjects.get(i).getName().equals(subjectname)) {
			index = i;
			break;
		    }
		}
		return index;
	}
	
	public int removefromSubjects(int index, String subjectname) {
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("The subject " + subjectname + " is deleted.");
			return 1;
		}
		else {
			System.out.println("The subject has not been registered."); 
			return -1;
		}
	}

	public void Editsubjects() {
		System.out.print("Subject name : ");
		String subjectname = input.next();
		for(int i = 0; i<subjects.size(); i++) {
			SubjectInput subject = subjects.get(i);
			if (subject.getName().equals(subject.getName())){
				int num = -1;
				while(num != 3) {
					showEditMenu();
					num = input.nextInt();
					switch(num){
					case 1:
						subject.setSubjectName(input);
						break;
					case 2:
						subject.setSubjectGrade(input);
						break;
					default:
						continue;
					}
				}
				break;
		    } 
		}
	}
	
	public void Viewsubjects() {
		System.out.println("# of registered subjects : " + subjects.size());
		for (int i = 0; i<subjects.size(); i++) {
			subjects.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("** subject info Edit Menu**");
		System.out.println("1. Edit name");
		System.out.println("2. Edit grade");
		System.out.println("3. Exit");
		System.out.println("Select ont number between 1-3 : ");
	}
}

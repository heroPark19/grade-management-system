package subject;

import java.util.Scanner;

public interface SubjectInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setGrade(double grade);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setSubjectName(Scanner input);
	
	public void setSubjectGrade(Scanner input);
}

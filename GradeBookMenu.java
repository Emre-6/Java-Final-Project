import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GradeBookMenu {

	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public GradeBookMenu() throws InputMismatchException, InvalidPercentageException, InvalidMenuSelectionException
	{
		System.out.println("1. Add Student ");
		System.out.println("2. Display All Students ");
		System.out.println("3. Add A Grade for a student using their ID ");
		System.out.println("4. Display a particular student using his/her ID ");
		System.out.println("5. Terminate ");
		
		int input=0;
		
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException : " + input);
		}
		
		if(input <= 0 || input >5) throw new InvalidMenuSelectionException(input + "is out of menu range");
		
		
		if (input == 1) {

			System.out.println("Enter Name");
			String name = scan.next();
			
			System.out.println("Enter Surname");
			String surname = scan.next();
			
			Student s = new Student(name, surname);
			
			studentList.add(s);
			
			System.out.println("Student Successfully Added!");
		}
		
		if (input == 2) {
			
			if (studentList.size() == 0) {
				System.out.println("No Student has been added yet!");
			}
			
			for (int i = 0; i < studentList.size(); i++) {
				studentList.get(i).toString();
			}
			
		}
		
		if (input == 3) {
			
			System.out.println("Enter Student ID");
			int id = scan.nextInt();
			
			System.out.println("Enter Grade");
			int grade = scan.nextInt();
			
			System.out.println("Enter Percentage");
			double percentage = scan.nextDouble();
			
			studentList.get(id+1).addGrade(percentage, grade);
			
		}
		
		if (input == 4) {
			
			System.out.println("Enter ID");
			int id = scan.nextInt();
			
			studentList.get(id+1).toString();
		}
		
		if (input == 5) {
			System.out.println("Terminated !");
		}
		
		
		while(input != 5)
		{
			System.out.println("1. Add Student ");
			System.out.println("2. Display All Students ");
			System.out.println("3. Add A Grade for a student using their ID ");
			System.out.println("4. Display a particular student using his/her ID ");
			System.out.println("5. Terminate ");
			
			try {
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException : " + input);
			}
			
			if(input <= 0 || input >5) throw new InvalidMenuSelectionException(input + "is out of menu range");
			
			if (input == 1) {

				System.out.println("Enter Name");
				String name = scan.next();
				
				System.out.println("Enter Surname");
				String surname = scan.next();
				
				Student s = new Student(name, surname);
				
				studentList.add(s);
				
				System.out.println("Student Successfully Added!");
			}
			
			if (input == 2) {
				
				if (studentList.size() == 0) {
					System.out.println("No Student has been added yet!");
				}
				
				for (int i = 0; i < studentList.size(); i++) {
					System.out.println(studentList.get(i).toString());
				}
				
			}
			
			if (input == 3) {
				
				System.out.println("Enter Student ID");
				int id = scan.nextInt();
				
				System.out.println("Enter Grade");
				int grade = scan.nextInt();
				
				System.out.println("Enter Percentage");
				double percentage = scan.nextDouble();
				
				studentList.get(id-1).addGrade(percentage, grade);
				
			}
			
			if (input == 4) {
				
				System.out.println("Enter ID");
				int id = scan.nextInt();
				
				System.out.println(studentList.get(id-1).toString());
			}
			
			if (input == 5) {
				System.out.println("Terminated !");
			}
		}
	}

}

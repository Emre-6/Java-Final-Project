import java.util.Random;
import java.util.Scanner;

public class Assignment 
{
	
	String[] randomNames= {"Ali","Veli","Ahmet","Ayse","Fatma"};
	String[] randomSurnames={"Oglu","Kısa","Uzun","Kır","Orta"};
	String [] randomMail = {"@hotmail.com", "@gmail.com", "@windowslive.com", "@yahoo.com", "@mynet.com"};
	String [] randomDepartments = {"Computer Engineering", "Electrical - Electronical Engineering", "Industrial Engineering","Civil Engineering","Mechanical Engineering"}; 
	Random rnd=new Random();
	
	Student[] students;
	
	int[] assignment1 = new int[20];
	int[] assignment2 = new int[20];
	int[] assignment3 = new int[20];
	int[] assignment4 = new int[20];
	int[] assignment5 = new int[20];
	
	double[] average = new double[20];
	

	public void assignID()
	{
		for (int i = 0; i < 20; i++) {
			
			if("Computer Engineering".equals(students[i].getDepartment().toString()))
			{
				students[i].setID(1000+rnd.nextInt(1000));
			}
			
			if("Electrical - Electronical Engineering".equals(students[i].getDepartment().toString()))
			{
				students[i].setID(2000+rnd.nextInt(1000));
			}
			
			if("Industrial Engineering".equals(students[i].getDepartment().toString()))
			{
				students[i].setID(3000+rnd.nextInt(1000));
			}
			
			if("Civil Engineering".equals(students[i].getDepartment().toString()))
			{
				students[i].setID(4000+rnd.nextInt(1000));
			}
			
			if("Mechanical Engineering".equals(students[i].getDepartment().toString()))
			{
				students[i].setID(5000+rnd.nextInt(1000));
			}
		}
	}
	
	public void simulate()
	{
		students = new Student[20];
		
		for (int i = 0; i < 20; i++) {
			
			Student s = new Student(
			randomNames[rnd.nextInt(5)].toString(),
			(randomSurnames[rnd.nextInt(5)]),
			(randomDepartments[rnd.nextInt(5)]),
			(rnd.nextInt(1000000)+rnd.nextInt(9999999)),
			(randomMail[rnd.nextInt(5)])
			);
			
			
			
			students[i] = s;
			
			assignment1[i] = rnd.nextInt(99)+1;
			assignment2[i] = rnd.nextInt(99)+1;
			assignment3[i] = rnd.nextInt(99)+1;
			assignment4[i] = rnd.nextInt(99)+1;
			assignment5[i] = rnd.nextInt(99)+1;
			
			
		}
	}
	
	public void report()
	{
		for (int i = 0; i < 20; i++) {
			
			average[i] = (assignment1[i]+assignment2[i]+assignment3[i]+assignment4[i]+assignment5[i])/5.0;
		}
		
		int maxID=0;
		double maxGrade=0;
		
		for (int i = 0; i < 20; i++) {
			
			if(average[i] > maxGrade)
			{
				maxGrade = average[i];
				maxID = i;
			}
		}
		
		System.out.println("Max graded Student is " + students[maxID].getName() + " " +students[maxID].getSurname() + " with Grade: " + average[maxID]);
		
	}
}


public class Student 
{
	
	private int StudentNumber;
	private String Name;
	private String Surname;
	private String firstCourse;
	private String secondCourse;
	private String thirdCourse;
	
	public Student(int StudentNumber,String Name,String Surname,String firstCourse,String secondCourse,String thirdCourse)
	{
		this.StudentNumber=StudentNumber;
		this.Name=Name;
		this.Surname=Surname;
		this.firstCourse=firstCourse;
		this.secondCourse=secondCourse;
		this.thirdCourse=thirdCourse;
	}
	
	public int getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getFirstCourse() {
		return firstCourse;
	}
	public void setFirstCourse(String firstCourse) {
		this.firstCourse = firstCourse;
	}
	public String getSecondCourse() {
		return secondCourse;
	}
	public void setSecondCourse(String secondCourse) {
		this.secondCourse = secondCourse;
	}
	public String getThirdCourse() {
		return thirdCourse;
	}
	public void setThirdCourse(String thirdCourse) {
		this.thirdCourse = thirdCourse;
	}		
	
	public void print()
	{
		System.out.println("Name:"+this.Name+"Surname:"+this.Surname+"FirstCourse:"+this.firstCourse+"SecondCourse:"+this.secondCourse+"ThirdCourse:"+this.thirdCourse);
	}
	
	public void calculateSemesterGPA(String firstCourse,String secondCourse,String thirdCourse)
	{
		
	}
}

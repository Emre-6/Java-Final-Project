
public class Course {
	
	
	private String CourseName;
	private String CourseID;
	private String InstructorName;
	private int DayOfWeek;
	private int ECTS;
	private String lettergrade;
	
	
	public Course(String CourseName,String CourseID,String InstructorName,int DayOfWeek,int ECTS,String lettergrade)
	{
		this.CourseName=CourseName;
		this.CourseID=CourseID;
		this.InstructorName=InstructorName;
		this.DayOfWeek=DayOfWeek;
		this.ECTS=ECTS;
		this.lettergrade=lettergrade;
		
	}
	
	
	public void setCourseName(String CourseName)
	{
		this.CourseName=CourseName;
	}
	public String getCourseName()
	{
		return CourseName;
	}
	public void setCourseID(String CourseID)
	{
		this.CourseID=CourseID;
	}
	public String getCourseID()
	{
		return CourseID;
	}
	public void setInstructorName(String InstructorName)
	{
		this.InstructorName=InstructorName;
	}
	public String getInstructorName()
	{
		return InstructorName;
	}
	public void setDayOfWeek(int DayOfWeek)
	{
		this.DayOfWeek=DayOfWeek;
	}
	public int getDayOfWeek()
	{
		return DayOfWeek;
	}
	public void setECTS(int ECTS)
	{
		this.ECTS=ECTS;
	}
	public int getECTS()
	{
		return ECTS;
	}
	public void setlettergrade(String lettergrade)
	{
		this.lettergrade=lettergrade;
	}
	public String getlettergrade()
	{
		return lettergrade;
	}
	public String toString()
	{
		return "CourseName:" +CourseName+"\tCourseID:" +CourseID+"\tInstructorName:"+InstructorName+"\tDayOfWeek:"+DayOfWeek+"\tECTS:"+ECTS+"\tLetterGrade:"+lettergrade;
	}
	
	public double AverageGPA()
	{
		this.getlettergrade();
		if(this.getlettergrade().equals("A"))
		{
			return 4.00;
		}
		else if(this.getlettergrade().equals("A-"))
		{
			return 3.70;
		}
		else if(this.getlettergrade().equals("B+"))
		{
			return 3.30;
		}
		else if(this.getlettergrade().equals("B"))
		{
			return 3.00;
		}
		else if(this.getlettergrade().equals("B-"))
		{
			return 2.70;
		}
		else if(this.getlettergrade().equals("C+"))
		{
			return 2.30;
		}
		else if(this.getlettergrade().equals("C"))
		{
			return 2.00;
		}
		else if(this.getlettergrade().equals("C-"))
		{
			return 1.70;
		}
		else if(this.getlettergrade().equals("D+"))
		{
			return 1.30;
		}
		else if(this.getlettergrade().equals("D"))
		{
			return 1.00;
		}
		else if(this.getlettergrade().equals("F"))
		{
			return 0.00;
		}
		return ECTS;
	}
}

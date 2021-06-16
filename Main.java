import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		
		Car carArray[] = new Car[4];
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		int year=1900+random.nextInt(120);
		String color[]=new String[]{"Red","Blue","Black","White"};
		System.out.println(Arrays.toString(color));
		
		
		Car c;
		
		
		
		for(int i=0;i<carArray.length;i++)
		{
			c=new Car();
			
			c.setYear(1900+random.nextInt(120));
			c.setColor(Arrays.toString(color));
			c.setModel(scan.next());
			
			carArray[i]=c;
			
		}
		
		for(int i=0;i<carArray.length;i++)
		{
			System.out.println("Color:"+color[i]);
			System.out.println("Year:"+carArray[i].getYear());
			System.out.println("Model:"+carArray[i].getModel());
			
			
		}
		int max=carArray[0].getYear();
		for(int i=0;i<carArray.length;i++)
		{
			if(carArray[i].getYear()>max)
			
				max=carArray[i].getYear();
				
			System.out.println("Color:"+color[i]);
			System.out.println("Year:"+carArray[i].getYear());
			System.out.println("Model:"+carArray[i].getModel());
			
			
		}
		
		
	}
}

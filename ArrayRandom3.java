import java.util.Random;
import java.util.Scanner;

public class ArrayRandom3 
{
	public static void main(String[]args)
	{
		Scanner value=new Scanner(System.in);
		Random array=new Random();
		int Array3[]=new int[10];
		
		int i;
	
		for(i=0;i<10;i++)
		{
			Array3[i]=array.nextInt(10);
			
		}
		for(i=0;i<10;i++)
		{
			System.out.println("Array3["+i+"]:"+Array3[i]);
		}
		
		int min=0;
		int max=9;
		for(i=0;i<10;i++)
		{
			if(Array3[i]<Array3[min])
			{
				min=i;
			}
			else if(Array3[i]>Array3[max])
			{
				max=i;
			}
		}
		int temp=Array3[min];
		Array3[min]=Array3[max];
		Array3[max]=temp;
		for(i=0;i<10;i++)
		{
			System.out.println("Array3["+i+"]:"+Array3[i]);
		}
	}
	
}

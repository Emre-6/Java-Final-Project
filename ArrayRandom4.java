import java.util.Random;
import java.util.Scanner;

public class ArrayRandom4 
{
	public static void main(String[]args)
	{
		Scanner value=new Scanner(System.in);
		Random array=new Random();
		int Array4[]=new int[10];
		
		int i;
		
		for(i=0;i<10;i++)
		{
			Array4[i]=array.nextInt(10);
			
		}
		for(i=0;i<10;i++)
		{
			System.out.println("Array4["+i+"]:"+Array4[i]);
		}
		int min1=0;
		int min2=1;
		int max1=9;
		int max2=8;
		for(i=0;i<10;i++)
		{
			if(Array4[min1]<Array4[min2])
			{
				min2=min1;
			}
			else if(Array4[max1]>Array4[max2])
			{
				max1=max2;
			}
		}
		int temp=Array4[min2];
		Array4[min2]=Array4[max1];
		Array4[max1]=temp;
		for(i=0;i<10;i++)
		{
			System.out.println("Array4["+i+"]:"+Array4[i]);
		}
		
	}
	
}

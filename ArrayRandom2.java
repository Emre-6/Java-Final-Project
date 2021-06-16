import java.util.Random;
import java.util.Scanner;

public class ArrayRandom2 
{
	public static void main(String[]args)
	{
		Scanner value=new Scanner(System.in);
		Random array=new Random(); 
		int Array1[]=new int[10];
		int Array2[]=new int[10];
		int i;
		
		for(i=0;i<10;i++)
		{
			Array1[i]=array.nextInt(10);
			Array2[i]=array.nextInt(10);
		}
		for(i=0;i<10;i++)
		{
			System.out.println("Arr1["+i+"]"+Array1[i]+"Arr2["+i+"]:"+Array2[i]);
		}
		
		System.out.println("Enter two indexes:");
		int a=value.nextInt();
		int b=value.nextInt();
		
		int temp=Array1[a];
		Array1[a]=Array2[b];
		Array2[b]=temp;
		
		for(i=0;i<10;i++)
		{
			System.out.println("Array1["+i+"]:"+Array1[i]+"Array2["+i+"]:"+Array2[i]);
		}
	}
}

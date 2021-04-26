
public class Random extends Main
{
	public static void main(String[]args)
	{
		int minimum=1;
		int maximum=100;
		
		
		for(int i=1;i<100;i++)
		{
			System.out.println("Random Number Value:"+minimum+"to"+maximum+":");
			int random=(int) (Math.random()*(maximum-minimum+1)+minimum);
			System.out.println(random);
		}
		
	}
		
}

import java.util.Random;

public class Main 
{
	private static int level;
	private static int attack;
	private static int power;
	private static int defense;
	
	public static void main(String[]args)
	{
		Random rndvalue=new Random();
		
		int rnd=rndvalue.nextInt(100);
		
		int HealthPower=rndvalue.nextInt(100);
		System.out.println("HealthPower:"+HealthPower);
		int MagicPower=rndvalue.nextInt(100);
		System.out.println("MagicPower:"+MagicPower);
		int AttackStrength=rndvalue.nextInt(100);
		System.out.println("AttackStrength:"+AttackStrength);
		int MagicalAttackStrength=rndvalue.nextInt(100);
		System.out.println("MagicalAttackStrength:"+MagicalAttackStrength);
		int DefenseStrength=rndvalue.nextInt(100);
		System.out.println("DefenseStrength:"+DefenseStrength);
		int MagicalDefenseStrength=rndvalue.nextInt(100);
		System.out.println("MagicalDefensesStrength:"+MagicalDefenseStrength);
		int Speed=rndvalue.nextInt(100);
		System.out.println("Speed:"+Speed);
		
		HealthPower=rndvalue.nextInt(80)+20;
		System.out.println("Level 1 Character HealthPower:"+HealthPower);
		MagicPower=rndvalue.nextInt(25)+50;
		System.out.println("Level 1 Character MagicPower:"+MagicPower);
		AttackStrength=rndvalue.nextInt(40)+5;
		System.out.println("Level 1 Character AttackStrength:"+AttackStrength);
		MagicalAttackStrength=rndvalue.nextInt(25)+20;
		System.out.println("Level 1 Character MagicalAttackStrength:"+MagicalAttackStrength);
		DefenseStrength=rndvalue.nextInt(30)+5;
		System.out.println("Level 1 DefenseStrength:"+DefenseStrength);
		MagicalDefenseStrength=rndvalue.nextInt(40)+5;
		System.out.println("Level 1 Character MagicalDefensesStrength:"+MagicalDefenseStrength);
		Speed=rndvalue.nextInt(9)+1;
		System.out.println("Level 1 Character Speed:"+Speed);
		

		int j=1;
		for(int i=1;i<100;i++)
		for(j=1;j<100;j++)	
			attack=(i/100)*40;
			defense=(j/100)*40;
		int totaldamage=Damage(level,power,attack,defense);
	
	}

	public static int Damage(int level,int power,int attack,int defense)
	{
		int damage=(((((level*2)/5)+2)*power*(attack/defense))/50)+10;
		System.out.println(damage);
		return damage;
	}
}

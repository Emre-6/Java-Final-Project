
public abstract class Characters 
{
	private String CharacterName;
	private int HealthPower;
	private int MagicPower;
	private int AttackStrength;
	private int MagicalAttackStrength;
	private int DefenseStrength;
	private int MagicalDefenseStrength;
	private int Speed;

	public Characters(String CharacterName,int HealthPower,int MagicPower,int AttackStrength,int MagicalAttackStrength,int DefenseStrength,int MagicalDefenseStrength,int Speed)
	{
		this.CharacterName=CharacterName;
		this.HealthPower=HealthPower;
		this.MagicPower=MagicPower;
		this.AttackStrength=AttackStrength;
		this.MagicalAttackStrength=MagicalAttackStrength;
		this.DefenseStrength=DefenseStrength;
		this.MagicalDefenseStrength=MagicalDefenseStrength;
		this.Speed=Speed;
	}

	public void setCharacterName(String CharacterName)
	{
		this.CharacterName=CharacterName;
	}
	public String getCharacterName()
	{
		return CharacterName;
	}
	public void setHealthPower(int HealthPower)
	{
		this.HealthPower=HealthPower;
	}
	public int getHealthPower()
	{
		return HealthPower;
	}
	public void setMagicPower(int MagicPower)
	{
		this.MagicPower=MagicPower;
	}
	public int getMagicPower()
	{
		return MagicPower;
	}
	public void setAttackStrength(int AttackStrength)
	{
		this.AttackStrength=AttackStrength;
	}
	public int getAttackStrength()
	{
		return AttackStrength;
	}
	
	public void setMagicalAttackStrength(int MagicalAttackStrength)
	{
		this.MagicalAttackStrength=MagicalAttackStrength;
	}
	
	public int getMagicalAttackStrength()
	{
		return MagicalAttackStrength;
	}
	
	public void setDefenseStrength(int DefenseStrength)
	{
		this.DefenseStrength=DefenseStrength;
	}
	public int getDefenseStrength()
	{
		return DefenseStrength;
	}
	public void setMagicalDefenseStrength(int MagicalDefenseStrength)
	{
		this.MagicalDefenseStrength=MagicalDefenseStrength;
	}
	public int getMagicalDefenseStrength()
	{
		return MagicalDefenseStrength;
	}
	public void setSpeed(int Speed)
	{
		this.Speed=Speed;
	}
	public int getSpeed()
	{
		return Speed;
	}
	
	
}
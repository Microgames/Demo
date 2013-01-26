
public class Character {
	
	//declaring variables
	String characterName;
	short characterHealth;
	
	//the constructor for setting up the character
	public Character()
	{
		characterName = "Josh";
		characterHealth = 10;		
	}
	
	//get the character's health
	public int getCharacterHealth()
	{
		return this.characterHealth;
	}
	
	//get the character's name
	public String getCharacterName()
	{
		return this.characterName;
	}
}

/**
 * 
 */
package testEpitech;

/**
 * @author diallo
 *
 */
abstract class Character {
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	final String RPGClass = "Character";
	/**
	 * @param name
	 * 
	 */
	Character(String name) {
		super();
		this.name = name;
		this.life = 50;
		this.agility = 2;
		this.strength = 2;
		this.wit = 2;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getWit() {
		return wit;
	}
	public void setWit(int wit) {
		this.wit = wit;
	}
	public String getRPGClass() {
		return RPGClass;
	}
	
	protected abstract void attack(String arg);
	
	
}

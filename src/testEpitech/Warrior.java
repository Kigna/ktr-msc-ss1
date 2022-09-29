package testEpitech;

class Warrior extends Character{

	Warrior(String name) {
		super(name);
		super.setLife(100);
		super.setStrength(10);
		super.setAgility(8);
		super.setWit(3);
		System.out.println(this.getName()+": My name will go down in history !");
	}

	@Override
	protected void attack(String arg) {
		if( arg == "hammer" || arg == "sword") { 
			System.out.println(this.getName()+": Rrrrrrrrrrrr... ");
			System.out.println(this.getName()+": I ' ll crush you with my "+arg);
		}
	}

}

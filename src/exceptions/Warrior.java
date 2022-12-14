package exceptions;

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

	@Override
	public void moveRight() {
		System.out.println(this.getName()+": moves right like a bad boy.");
	}

	@Override
	public void moveLeft() {
		System.out.println(this.getName()+": moves left like a bad boy.");
	}

	@Override
	public void moveForward() {
		System.out.println(this.getName()+": moves forward like a bad boy.");
	}

	@Override
	public void moveBack() {
		System.out.println(this.getName()+": moves back like a bad boy.");
	}
}

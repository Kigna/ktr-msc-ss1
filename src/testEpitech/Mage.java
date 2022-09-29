package testEpitech;

class Mage extends Character{

	Mage(String name) {
		super(name);
		super.setLife(70);
		super.setStrength(3);
		super.setAgility(10);
		super.setWit(10);
		System.out.println(this.getName()+": May the gods be with me.");
	}

	@Override
	protected void attack(String arg) {
		if( arg == "magic" || arg == "wand") { 
			System.out.println(this.getName()+": Rrrrrrrrrrrr... ");
			System.out.println(this.getName()+": Feel the power of my "+arg);
		}
	}

	@Override
	public void moveRight() {
		System.out.println(this.getName()+": moves right furtively.");
	}

	@Override
	public void moveLeft() {
		System.out.println(this.getName()+": moves left furtively.");
	}

	@Override
	public void moveForward() {
		System.out.println(this.getName()+": moves forward furtively.");
	}

	@Override
	public void moveBack() {
		System.out.println(this.getName()+": moves back furtively.");
	}

}

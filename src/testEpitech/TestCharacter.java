package testEpitech;

class TestCharacter extends Character{

	TestCharacter(String name) {
		super(name);
	}

	@Override
	protected void attack(String arg) {
		System.out.println(this.getName()+": Rrrrrrrrrrrr... ");
	}
	
}

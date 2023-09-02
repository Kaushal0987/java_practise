package Animal;

class Monkey {
	void jump() {
		System.out.println("This is a monkey jumping");
	}
	void bite() {
		System.out.println("This is a monkey biting");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class Human extends Monkey implements BasicAnimal{
	public void eat() {
		System.out.println("This human is eating");
	}
	
	public void sleep() {
		System.out.println("This human is sleeping");
	}
}

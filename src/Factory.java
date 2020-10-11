
public class Factory {
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int RABBIT = 2;
	public static final int PELICAN = 3;
	
	public Animal getAnimal(int id) {
		switch(id) {
		case DOG:
			return new Dog();
		case CAT: 
			return new Cat();
		case RABBIT:
			return new Rabbit();
		case PELICAN:
			return new Pelican();
		default:
			throw new IllegalArgumentException("Wrong Animal-Number!");
		}
	}
	public void printInfo(Animal a) {
		System.out.println("Name: "+a.getName());
		System.out.println("Legs: "+a.getCountOfLegs());
		System.out.println("Teeth: "+a.getCountOfTeeth());
		System.out.println("Herbivore: "+a.isHerbivore());
		System.out.println("Ability to fly: "+a.canFly()+"\n");
	}
}

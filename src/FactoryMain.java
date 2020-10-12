
public class FactoryMain {

	public static void main(String[] args) {
		Factory f = new Factory();
		
		Animal dog = f.getAnimal(AnimalName.DOG);
		Animal cat = f.getAnimal(AnimalName.CAT);
		Animal rabbit = f.getAnimal(AnimalName.RABBIT);
		Animal pelican = f.getAnimal(AnimalName.PELICAN);
		
		f.printInfo(dog);
		f.printInfo(cat);
		f.printInfo(rabbit);
		f.printInfo(pelican);
	}

}


public class FactoryMain {

	public static void main(String[] args) {
		Factory f = new Factory();
		
		Animal dog = f.getAnimal(Factory.DOG);
		Animal cat = f.getAnimal(Factory.CAT);
		Animal rabbit = f.getAnimal(Factory.RABBIT);
		Animal pelican = f.getAnimal(Factory.PELICAN);
		
		f.printInfo(dog);
		f.printInfo(cat);
		f.printInfo(rabbit);
		f.printInfo(pelican);
	}

}

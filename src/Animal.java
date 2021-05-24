public abstract class Animal {
	private String name;
	private int numberOfLegs;
	private int numberOfTeeth;
	private boolean herbivore;
	private boolean fly;
	
	public Animal(String name, int numberOfLegs, int numberOfTeeth, boolean herbivore, boolean fly) {
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.numberOfTeeth = numberOfTeeth;
		this.herbivore = herbivore;
		this.fly = fly;
	}
	public String getName() {
		return name;
	}
	public int getCountOfLegs() {
		return numberOfLegs;
	}
	public int getCountOfTeeth() {
		return numberOfTeeth;
	}
	public boolean isHerbivore() {
		return herbivore;
	}
	public boolean canFly() {
		return fly;
	}
}

/*
public interface Animal {
	public String getName();
	public int getCountOfLegs();
	public int getCountOfTeeth();
	public boolean isHerbivore();
	public boolean canFly();
}
*/
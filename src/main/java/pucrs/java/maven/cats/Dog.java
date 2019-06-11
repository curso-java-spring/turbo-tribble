package pucrs.java.maven.cats;

public class Dog extends Pet {

	/**
	 * Use Dog(String, Pet.Gender) instead.
	 * @param name
	 */
	@Deprecated
	public Dog(String name) {
		super(name, Pet.Gender.MALE);
	}
	
	public Dog(String name, Pet.Gender sex) {
		super(name, sex);
	}
	
	public String bark() {
		return getName() + " " + "Whoof!";
	}

	@Override
	public String talk() {
		return bark();
	}

}

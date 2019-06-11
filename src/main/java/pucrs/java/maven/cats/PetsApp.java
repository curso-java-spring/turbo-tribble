package pucrs.java.maven.cats;

/**
 * The class GatosApp is pet clinic system starting point.
 *
 */
public class PetsApp {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Cats!");

		PetCatalog cats = new PetCatalog();
		cats.add(new Cat("Garfield"));
		cats.add(new Cat("Tom"));
		cats.add(new Cat("TopCat"));

		cats.add(new Dog("Beethoven"));
		cats.add(new Dog("Marley"));
		cats.add(new Dog("Bud"));
		
		
		cats.doMeow();
		cats.doBark();
	}
}

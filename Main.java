public class Main {
	public static void main(String[] args) {
		World myWorld = new World(
				new Country("USA",
						new State("NY", 
							new City("New York", 8143197)),
						new City("LA", 3844829),
						new City("Chicago", 2842518),
						new District("Washington D.C.", 658893)));
				

	myWorld.printPopulation();
	
	System.out.println();
	
	myWorld.printWorld();
	}
}
public class World {
	private Country[] countries;

	public World(Country... entities) {
		countries = entities;
	}
	
	public void printPopulation() {
		int result = 0;
		
		for(Country c: countries) {
			result += c.getPopulation();
		}
		
		System.out.format("World Population: %d", result);
	}
	
	public void printWorld() {
		StringBuffer result = new StringBuffer();
		
		for(Country c: countries) {
			result.append(c.getString() + " ");
		}
		
		System.out.println("World to String: " + result.toString());
	}
}
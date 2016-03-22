public class City implements Municipality{
	private int population;
	private String name;
	
	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	@Override
	public int getPopulation() {
		return population;
	}

	@Override
	public String getString() {
		return name;
	}
}
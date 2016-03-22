public class District implements Municipality{
	private int population;
	private String name;
	
	public District(String name, int population) {
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
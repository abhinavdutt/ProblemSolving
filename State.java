public class State implements Municipality{
	private String name;
	private Municipality[] municipalities;
	
	public State(String name, Municipality... entities) {
		this.name = name;
		municipalities = entities;
	}

	@Override
	public int getPopulation() {
		int result = 0;
		
		for(Municipality mun: municipalities) {
			result += mun.getPopulation();
		}
		
		return result;
	}

	@Override
	public String getString() {
		StringBuffer result = new StringBuffer();
		result.append(name);
		
		for(Municipality mun: municipalities) {
			result.append(" " + mun.getString());
		}
		
		return result.toString();
	}
}
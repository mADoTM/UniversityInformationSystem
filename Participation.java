public class Participation {

	public int hours;

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public Participation(Double hours) {
		// TODO - implement Participation.Participation
	}

	@Override
	public String toString() {
		return "Participation{" +
				"hours=" + hours +
				'}';
	}

	public Participation(int hours) {
		this.hours = hours;
	}
}
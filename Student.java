public class Student {

	public String name;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void executeTask() {
		// TODO - implement Student.executeTask
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	public Student(String name) {
		this.name = name;
	}
}
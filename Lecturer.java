public class Lecturer extends ResearchAssociate {

	public void checkTask() {
		// TODO - implement Lecturer.checkTask
		throw new UnsupportedOperationException();
	}

	public void giveTask() {
		// TODO - implement Lecturer.giveTask
		throw new UnsupportedOperationException();
	}


	public Lecturer(int ssNo, int workExperience, String email, String name, int counter) {
		this.name = name;
		this.email = email;
		this.counter = counter;
		this.ssNo = ssNo;
	}

	@Override
	public String toString() {
		return "Lecturer{" +
				"fieldOfStudy='" + fieldOfStudy + '\'' +
				", name='" + name + '\'' +
				", counter=" + counter +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", ssNo=" + ssNo +
				'}';
	}
}
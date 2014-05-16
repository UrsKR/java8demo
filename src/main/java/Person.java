public class Person implements Lifeform {

	private String name;
	private int birthYear;
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}
	
	public Integer getBirthYear() {
		return birthYear;
	}
}
package src.com.aurionpro.model;

public class Player {

	private String name;
	private int age;
	private String country;

	/**
	 * @param name
	 * @param age
	 * @param country
	 */
	public Player(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

	public Player getElderPlayer(Player[] player) {
		double max = player[0].getAge();
		int index = 0;
		for (int i = 0; i < player.length; i++) {
			if (max < (player[i].getAge())) {
				max = player[i].getAge();
				index = i;
			}
		}
		return player[index];
	}

}
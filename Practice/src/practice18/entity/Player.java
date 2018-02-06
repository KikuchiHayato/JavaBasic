package practice18.entity;

public class Player {
	private String position;
	private String name;
	private String country;
	private String team;


	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String getTeam() {
		return this.team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	public String toString() {
		String comma = ",";

		StringBuilder str = new StringBuilder();
		str.append(this.position);
		str.append(comma);
		str.append(this.name);
		str.append(comma);
		str.append(this.country);
		str.append(comma);
		str.append(this.team);

		return str.toString();
	}

}

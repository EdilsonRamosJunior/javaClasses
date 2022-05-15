package application;

public class TestTraining {
	
	private Integer id;
	private String name;
	private Integer numberPhone;
	
	public TestTraining(Integer id, String name, Integer numberPhone) {
		this.id = id;
		this.name = name;
		this.numberPhone = numberPhone;
	}
	
	public String toString() {
		return "A pessoa é " + name + " com id : " + id + " e telefone: " + numberPhone;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(Integer numberPhone) {
		this.numberPhone = numberPhone;
	}
	
	
}

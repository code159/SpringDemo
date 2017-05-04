package dao.jdbctemplate;

public class TDao {
	private Integer id;
	private String name;
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	@Override
	public String toString() {
		return "TDao [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	public void setName(String name) {
		this.name = name;
	}

	
}

package test.domain;

public class ResponseTestDTO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ResponseTestDTO [name=" + name + "]";
	}

	public ResponseTestDTO(String name) {
		super();
		this.name = name;
	}

	public ResponseTestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

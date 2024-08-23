package test.domain;

public class RequestTestDTO {
	private String id, pwd;

	@Override
	public String toString() {
		return "RequestTestDTO [id=" + id + ", pwd=" + pwd + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd; 
	}

	public RequestTestDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	public RequestTestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

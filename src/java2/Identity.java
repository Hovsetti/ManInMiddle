package java2;

public class Identity {
	
	private String email;
	private String password;
	
	public Identity(String email, String password){
		setEmail(email);
		setPassword(password);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

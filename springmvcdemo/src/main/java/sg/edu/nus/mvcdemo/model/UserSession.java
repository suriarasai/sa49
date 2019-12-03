package sg.edu.nus.mvcdemo.model;

import org.springframework.web.context.annotation.SessionScope;

@SessionScope
public class UserSession {
	
	private String name;
	private String role;
	private String password;
	public UserSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSession(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public UserSession(String name, String role, String password) {
		super();
		this.name = name;
		this.role = role;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSession other = (UserSession) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserSession [name=" + name + ", role=" + role + "]";
	}
	
	
	

}

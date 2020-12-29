package kr.or.connect.reservation.dto;

public class UserRole {
	private int id;
	private int user_id;
	private String role_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserRole [id=" + id + ", user_id=" + user_id + ", role_name=" + role_name + "]";
	}
	
}

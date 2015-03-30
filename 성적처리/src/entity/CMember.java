package entity;

// Entity class or Value class
public class CMember {
	// attributes
	private String userID, password;
	
	public CMember() {}
	public CMember(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public void print() {
		System.out.println("»ç¿ëÀÚ ID: "+userID);
		System.out.println("Password: "+password);
	}
}

package entity;

import java.io.Serializable;

// Entity class or Value class
public class CMember implements Serializable{
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
	

	
}

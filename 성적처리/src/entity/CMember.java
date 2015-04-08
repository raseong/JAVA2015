package entity;

import java.util.Scanner;

// Entity class or Value class
public class CMember extends CEntity {
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
		System.out.println("����� ID: "+userID);
		System.out.println("Password: "+password);
	}
	@Override
	public boolean read(Scanner scanner) {
		this.userID = scanner.next();
		this.password = scanner.next();
		if(scanner.hasNext())
			return true;
		else
			return false;
	}
	@Override
	public void write() {
		
	}
}

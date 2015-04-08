package entity;

import java.util.Scanner;
import java.io.Serializable;

public class CGwamok extends CEntity {
	// Attribute
	private int ID;
	private String name;
	private int hakjeom;
	// Setters & Getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}
	@Override
	public void read(Scanner scanner) {
		
	}
	@Override
	public void write() {
		
	}
}

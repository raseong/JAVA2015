package entity;

import java.util.Scanner;
import java.util.Vector;

public class CGangjwa extends CEntity {
	// Attribute
	private int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times;
	private int gyosuID;
	private int gwamokID;
	// Setters & Getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	@Override
	public void read(Scanner scanner) {
		
	}
	@Override
	public void write() {
		
	}
	
}

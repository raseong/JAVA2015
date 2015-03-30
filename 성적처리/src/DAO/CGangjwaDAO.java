package DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;
import entity.CGwamok;


public class CGangjwaDAO {
	
	public CGangjwa read() { return null; }
	public void write(CGangjwa gangjwa) {
		System.out.println("���� ID: "+gangjwa.getID());
		System.out.println("���� �̸�: "+gangjwa.getName());
		System.out.println("���� �ο�: "+gangjwa.getSuganginwon());
		
		// serialize
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

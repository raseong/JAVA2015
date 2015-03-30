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
		System.out.println("강좌 ID: "+gangjwa.getID());
		System.out.println("강좌 이름: "+gangjwa.getName());
		System.out.println("수강 인원: "+gangjwa.getSuganginwon());
		
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

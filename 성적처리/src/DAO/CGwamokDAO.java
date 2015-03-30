package DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGwamok;

public class CGwamokDAO {
	
	public CGwamok read() { return null; }
	public void write(CGwamok gwamok)
	{
		System.out.println("���� ID: "+gwamok.getID());
		System.out.println("���� �̸�: "+gwamok.getName());
		
		// serialize
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gwamok"));
			out.writeObject(gwamok);
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

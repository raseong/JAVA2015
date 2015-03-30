package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import entity.CMember;

public class CMemberDAO {
	
	Vector<CMember> vt = new Vector<CMember>();
	
	// Data Access Object: Read or write data from persistent storage
	public CMember read(CMember member) throws IOException {
		File file = new File("member");
		FileReader writer = new FileReader(file);
		BufferedReader in = new BufferedReader(writer);
		
		String temp;
		String userID;
		String password;
		
		while((temp = in.readLine()) != null)
		{
			userID = temp.split(" ")[0];
			password = temp.split(" ")[1];
		
			vt.add(new CMember(userID, password));
		}
		CMember memberTemp = new CMember();
		for(int i=0; i<vt.size(); i++)
		{
			memberTemp = (CMember)vt.get(i);
			if(member.getUserID().equals(memberTemp.getUserID()) && member.getPassword().equals(memberTemp.getPassword()))
			{
				return memberTemp;
			}
		}
		return memberTemp;
	}
	
	public void write(CMember member) throws IOException {
		File file = new File("member");
		FileWriter writer = new FileWriter(file, true);
		BufferedWriter out = new BufferedWriter(writer);
		
		out.write(member.getUserID()+" "+member.getPassword());
		out.newLine();
		out.close();
	}
}

package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	// input from keyboard using scanner
	//private Scanner scanner;

	public CMember login() {
		//scanner = new Scanner(System.in);
		CMember member = new CMember();
		member.setUserID("userID");
		member.setPassword("password");
		//System.out.print("아이디: ");
		//userID = scanner.next();
		//System.out.print("패스워드: ");
		//password = scanner.next();
		
		// close scanner
		//scanner.close();
		
		return member;
	}

}

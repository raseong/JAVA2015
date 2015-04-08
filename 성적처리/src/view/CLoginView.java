package view;



import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		int type;
		
		System.out.print("아이디:");
		String userID = scanner.next();
		member.setUserID(userID);
		System.out.print("패스워드:");
		String password = scanner.next();
		member.setPassword(password);
		scanner.close();
		
		type = this.getControl().process(member);
		
		switch(type)
		{
		case 1: System.out.println("해당 사용자 아이디가 없습니다"); break;
		case 2: System.out.println("환영합니다."); break;
		case 3: System.out.println("패스워드가 틀렸습니다."); break;
		}
		return member;
	}

}
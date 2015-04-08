package view;



import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		int type;
		
		System.out.print("���̵�:");
		String userID = scanner.next();
		member.setUserID(userID);
		System.out.print("�н�����:");
		String password = scanner.next();
		member.setPassword(password);
		scanner.close();
		
		type = this.getControl().process(member);
		
		switch(type)
		{
		case 1: System.out.println("�ش� ����� ���̵� �����ϴ�"); break;
		case 2: System.out.println("ȯ���մϴ�."); break;
		case 3: System.out.println("�н����尡 Ʋ�Ƚ��ϴ�."); break;
		}
		return member;
	}

}
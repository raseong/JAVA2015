package ����ó��;



import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import DAOs.DAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {

	public static void main(String[] args) {
		// Login 
		// ����
		CLoginView 	loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		DAO memberDAO = new DAO();
		memberDAO.write(member,"member");
		member = (CMember) memberDAO.read("member");
		// ���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO = new DAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		// ���°���
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO();
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gwamok");
	}

}

package view;

import entity.CGangjwa;

public class CGangjwaView {

	public CGangjwa getGangjwa() {
		CGangjwa gangjwa = new CGangjwa();
		gangjwa.setID(10);
		gangjwa.setName("A��");
		gangjwa.setSuganginwon(40);
		gangjwa.setGwamokID(1);
		gangjwa.setGyosuID(100);
		
		return gangjwa;
	}
	
}

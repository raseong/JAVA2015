package view;

import entity.CGwamok;

public class CGwamokView extends CView{

	public CGwamok getGwamok() 
	{
		CGwamok gwamok = new CGwamok();
		gwamok.setID(1);
		gwamok.setName("자바프로그래밍");
		return gwamok;
	}
	
}

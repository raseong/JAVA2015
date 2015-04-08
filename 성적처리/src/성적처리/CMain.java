package 己利贸府;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;

public class CMain {

	public static void main(String[] args) {
		// Login
				// create objects
				CLoginView loginView = new CLoginView();
			
				CLoginControl loginControl = new CLoginControl();
			//
				IDAO dao = new TextDAO();
				//association
				loginView.setControl(loginControl);
				loginControl.setDao(dao);
				// start login
				loginView.login();
	
	}
 
}

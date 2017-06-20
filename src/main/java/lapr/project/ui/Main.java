package lapr.project.ui;

import lapr.project.model.CalculatorExample;
import lapr.project.model.FairCenter;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

	/**
	 * Private constructor to hide implicit public one.
	 */
	private Main(){

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {


                FairCenter fc = new FairCenter();
                LogInWindow logInWindow = new LogInWindow(fc);
                logInWindow.setVisible(true);  
	}

}

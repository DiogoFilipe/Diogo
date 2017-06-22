package lapr.project.ui;

import java.io.IOException;
import lapr.project.model.ReadExportFairCenter;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FairCenter fc;
        fc = ReadExportFairCenter.loadFairCenter(new FairCenter());
        if (fc == null) {
            fc = new FairCenter();
        }
        LogInWindow logInWindow = new LogInWindow(fc);
        logInWindow.setVisible(true);
    }

}

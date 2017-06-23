package lapr.project.ui;

import java.io.IOException;
import lapr.project.model.*;
import lapr.project.model.Organizer;

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
    public static void main(String[] args) throws IOException {
        FairCenter fc;
        fc = ReadExportFairCenter.loadFairCenter(new FairCenter());
                if(fc == null){
                    
                fc = new FairCenter();
                int shift1 = Encryption.gerateShift();
                int shift2 = Encryption.gerateShift();
                int shift3 = Encryption.gerateShift();
                String cipheredName1 = Encryption.cipherWithShift("organizer1", shift1);
                String cipheredUsername1 = Encryption.cipherWithShift("organizer1", shift1);
                String cipheredEmail1 = Encryption.cipherWithShift("organizer1@evento.com", shift1);
                String cipheredPassword1 = Encryption.cipherWithShift("password", shift1);              
                Organizer organizer1 = new Organizer(cipheredName1,cipheredUsername1,cipheredEmail1,cipheredPassword1);
                Encryption organizer1Encryption = new Encryption(organizer1,shift1);
                fc.getEncryptionList().getEncryptionsList().add(organizer1Encryption);
                fc.getUserRegist().getUserList().add(organizer1);
                fc.getOrganizerList().getOrganizerList().add(organizer1);
                String cipheredName2 = Encryption.cipherWithShift("organizer2", shift2);
                String cipheredUsername2 = Encryption.cipherWithShift("organizer2", shift2);
                String cipheredEmail2 = Encryption.cipherWithShift("organizer2@evento.com", shift2);
                String cipheredPassword2 = Encryption.cipherWithShift("password", shift2);         
                Organizer organizer2 = new Organizer(cipheredName2,cipheredUsername2,cipheredEmail2,cipheredPassword2);
                Encryption organizer2Encryption = new Encryption(organizer2,shift2);
                fc.getEncryptionList().getEncryptionsList().add(organizer2Encryption);
                fc.getUserRegist().getUserList().add(organizer2);
                fc.getOrganizerList().getOrganizerList().add(organizer2); 
                String cipheredName3 = Encryption.cipherWithShift("manager", shift3);
                String cipheredUsername3 = Encryption.cipherWithShift("manager", shift3);
                String cipheredEmail3 = Encryption.cipherWithShift("manager@evento.com", shift3);
                String cipheredPassword3 = Encryption.cipherWithShift("password", shift3);              
                EventManager manager = new EventManager(cipheredName3,cipheredUsername3,cipheredEmail3,cipheredPassword3);              
                Encryption managerEncryption = new Encryption(manager,shift3);
                fc.getEncryptionList().getEncryptionsList().add(managerEncryption);
                fc.getUserRegist().getUserList().add(manager);
                fc.getEventManagerList().getEventManagerList().add(manager);
                
        }
        LogInWindow logInWindow = new LogInWindow(fc);
        logInWindow.setVisible(true);
    }

}

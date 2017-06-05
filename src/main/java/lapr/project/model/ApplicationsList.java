
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ApplicationsList implements Serializable {
    
     private List<Application> applicationsList;
     
     public ApplicationsList() {
        applicationsList = new ArrayList<>();
    }

 
      public List<Application> getApplicationsList() {
        return applicationsList;
    }
      
      /**
       * Return´s the size of the applicationsList
       * @return List´s size
       */
       public int getSize(){
        return applicationsList.size();
    }
       
                    
        /**
         * Defines the applicationsList
         * @param applicationsList 
         */
     public void setListaCandidatura(List<Application> applicationsList){
        this.applicationsList = applicationsList;
    }
    
     /**
      * Removes an application from the applications list
      * @param application - Application to be removed
      * @return
      */
     public boolean removerCandidatura(Application application){
        return applicationsList.remove(application);
    }
       
     /**
      * Adds an application to the applications List
      * @param application - Applcation to be added
      * @return 
      */
     public boolean registApplication(Application application){
        if(!applicationsList.contains(application)){
            return this.applicationsList.add(application);
        }
        return false;
    }

     /**
      * Verifies there are any existing applications
      * @return 
      */
     public boolean isEmpty(){
        return applicationsList.isEmpty();
    }
     
}



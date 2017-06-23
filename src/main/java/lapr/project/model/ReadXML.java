/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author HP
 */
public class ReadXML implements Serializable{

    private static final long serialVersionUID = 8713225736616624061L;

    FairCenter fc;

 public static boolean readContent(File file,FairCenter fc) throws ParserConfigurationException{
     int shift = fc.getFcEncryption().getShift();
     
      String dsc = "";
     List <FAE> assigned = new ArrayList<>();
        Application ap = new Application();
        boolean accepted = false;
        Event ev = new Event();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            try {
                Document doc = builder.parse(file);
                Node event = doc.getElementsByTagName("event").item(0);
                Node title = doc.getElementsByTagName("title").item(0);
                 Element e = (Element)title;
                 Element evt = (Element)event;
                String titl = e.getTextContent();
                 String tl = Encryption.cipherWithShift(titl, shift);
                 ev = new Event(tl);
                 
                fc.getEventList().add(ev);
                ev.setState(EventState.State.Created);

                Node stands = evt.getElementsByTagName("stands").item(0);
                 Element stand = (Element)stands;
                NodeList standList = stand.getElementsByTagName("stand");

             
                for (int v = 0; v < standList.getLength(); v++) {
                    Node std = standList.item(v);
                 Element s = (Element)std;                                 
                    Node stdA = s.getElementsByTagName("area").item(0);
                    String area = stdA.getTextContent();
                    double ar = Double.parseDouble(area);
                    Stand stds = new Stand(ar);
                    ev.getStandList().getStandList().add(stds);

                }

                 
                Node faeSet = evt.getElementsByTagName("FAESet").item(0);
              Element faeSt = (Element)faeSet;
                NodeList faeList = faeSt.getElementsByTagName("fae");
                for (int k = 0; k < faeList.getLength(); k++) {
                    Node fl = faeList.item(k);
                     Element f = (Element)fl;
                    NodeList userToFaeList = f.getElementsByTagName("user");
                      for(int g=0;g < userToFaeList.getLength();g++){
                        Node user = userToFaeList.item(g);
                         Element fae = (Element)user;
                        Node name = fae.getElementsByTagName("name").item(0);
                        Node username = fae.getElementsByTagName("username").item(0);
                        Node email = fae.getElementsByTagName("email").item(0);
                        Node password = fae.getElementsByTagName("password").item(0);
                        String nam = name.getTextContent();
                        String mail = email.getTextContent();
                        String usernam = username.getTextContent();
                        String pass = password.getTextContent();
                         String nm = Encryption.cipherWithShift(nam, shift);
                         String ml =  Encryption.cipherWithShift(mail, shift);
                         String unm = Encryption.cipherWithShift(usernam, shift);
                         String pss = Encryption.cipherWithShift(pass, shift);
                         FAE fa = new FAE(nm,unm,ml,pss);
                        ev.getFAEList().getFAEList().add(fa);
                        ev.setState(EventState.State.FAESet);
                    }
                }
                Node applicationSet = evt.getElementsByTagName("applicationSet").item(0);
                Element applicationsSt = (Element) applicationSet;
                NodeList applicationsList = applicationsSt.getElementsByTagName("application");
                String descript = "";
                for (int l = 0; l < applicationsList.getLength(); l++) {
                    Node a = applicationsList.item(l);
                     Element app = (Element)a;
                    Node decision = app.getElementsByTagName("accepted").item(0);
                    Node description = app.getElementsByTagName("description").item(0);
                    Node boothArea = app.getElementsByTagName("boothArea").item(0);
                    Node invites = app.getElementsByTagName("invitesQuantity").item(0);
                    Node keywords = app.getElementsByTagName("keywords").item(0);
                     Element keys = (Element)keywords;
                    NodeList keywordList = keys.getElementsByTagName("keyword");
                     String decis = decision.getTextContent();
                    descript = description.getTextContent();
                     dsc = Encryption.cipherWithShift(descript, shift);
                    String booth = boothArea.getTextContent();
                    double bth = Double.parseDouble(booth);
                    String inv = invites.getTextContent();
                    int its = Integer.parseInt(inv);
                     List <Keyword> kws = new ArrayList<>();
                    for (int b = 0; b < keywordList.getLength(); b++) {
                         Node keyword =  keywordList.item(0);
                        String key = keyword.getTextContent();
                         String kyws = Encryption.cipherWithShift(key, shift);
                         Keyword k = new Keyword(kyws);
                        kws.add(k);
                    }
                     ap = new Application(its,bth,dsc,kws);
                    ap.setState(ApplicationState.State.Created);

                    NodeList reviews = app.getElementsByTagName("reviews");
                for (int s = 0; s < reviews.getLength()+1; s++) {     
                        Node rews = reviews.item(0);
                Element revs = (Element)rews;
                        NodeList reviewList = revs.getElementsByTagName("review");
                        Node review = reviewList.item(s);
                Element r = (Element)review;
                        NodeList assignments;
                        assignments = r.getElementsByTagName("assignment");
                        Node assign = assignments.item(0);
                        Element as = (Element)assign;
                        NodeList faeLst = as.getElementsByTagName("fae");
                        Node fae = faeLst.item(0);
                        Element f = (Element)fae;
                        NodeList assignedFae = f.getElementsByTagName("user");
                        Node assgUser = assignedFae.item(0);
                        Element af = (Element)assgUser;
                        Node name = af.getElementsByTagName("name").item(0);
                        Node username = af.getElementsByTagName("username").item(0);
                        Node email = af.getElementsByTagName("email").item(0);
                        Node password = af.getElementsByTagName("password").item(0);
                        String nam = name.getTextContent();
                        String nm = Encryption.cipherWithShift(nam, shift);
                        String mail = email.getTextContent();
                        String ml = Encryption.cipherWithShift(mail, shift);
                        String usernam = username.getTextContent();
                        String unm = Encryption.cipherWithShift(usernam, shift);
                        String pass = password.getTextContent();
                        String pss = Encryption.cipherWithShift(pass, shift);

                              if(null==ev.getFAEList().getFAE(unm)){
                                  FAE assignedFAE = new FAE(nm,unm,ml,pss);
                            ev.getFAEList().getFAEList().add(assignedFAE);
                            assigned.add(assignedFAE);
                              }else{    
                              FAE assignedFAE = ev.getFAEList().getFAE(unm);    
                              assigned.add(assignedFAE); }

                              
                        Node justification = r.getElementsByTagName("text").item(0);
                        Node faeKnowledge = r.getElementsByTagName("faeTopicKnowledge").item(0);
                        Node eventAdequacy = r.getElementsByTagName("eventAdequacy").item(0);
                        Node inviteAdequacy = r.getElementsByTagName("inviteAdequacy").item(0);
                        Node recommendation = r.getElementsByTagName("recommendation").item(0);
                        String justif = justification.getTextContent();
                String jstf = Encryption.cipherWithShift(justif, shift);
                        String knowledge = faeKnowledge.getTextContent();
                        String adequacy = eventAdequacy.getTextContent();
                        String invAdequacy = inviteAdequacy.getTextContent();
                        String recommend = recommendation.getTextContent();
                        int fk = Integer.parseInt(knowledge);
                        int aq = Integer.parseInt(adequacy);
                        int ia = Integer.parseInt(invAdequacy);
                        int rm = Integer.parseInt(recommend);
                 if(decis.equals("false")){
                 accepted =false;
                 }else if(decis.equals("true")){
                 accepted = true;}
                 Decision dc = new Decision(accepted,jstf,fk,aq,ia,rm);
                        ap.setD(dc);
                        ap.setState(ApplicationState.State.Decided);

                
                    }

                
                 
                         
                
                }
                 Application applic = ev.getApplicationList().getApplication(dsc);
                 Assignment faeDecision = new Assignment(assigned,applic);
                ev.getAssignmentList().getAssignmentList().add(faeDecision);
                assigned.clear();

                 
            } catch (SAXException ex) {
                ex.getMessage();
                return false;
            } catch (IOException ex) {
                ex.getMessage();
                return false;
            }
        } catch (ParserConfigurationException ex) {
            ex.getMessage();
            return false;
        }

        return true;
    }

}
     

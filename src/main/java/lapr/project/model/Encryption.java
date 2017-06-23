package lapr.project.model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Encryption implements Serializable {

    private static final long serialVersionUID = 1003084396534706974L;

    /**
     * keyword
     */
    private String keyword;

    /**
     * user
     */
    private User user;

    /**
     * shift
     */
    private int shift;

    /**
     * random number
     */
    Random rn = new Random();

    /**
     * Constructor
     *
     * @param user - of the encryption
     * @param keyword - encryption´s keyword
     * @param shift - encrytprions´s shift
     */
    public Encryption(User user, String keyword, int shift) {
        this.user = user;
        this.keyword = keyword;
        this.shift = shift;

    }

    public Encryption(User user, int shift) {
        this.user = user;
        this.shift = shift;
    }
    
    
    
    public Encryption(int shift){
    this.shift = shift;
    }


    
    
    /**
     * returns the encryption's shift
     *
     * @return shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * returns the encryption's keyword
     *
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * returns the encytption´s user
     *
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * defines the user
     *
     * @param user to be defined
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * defines the keyword
     *
     * @param keyword to be defined
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * defines the shift
     *
     * @param shift to be defined
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * return shift
     *
     * @return shift
     */
    public static int gerateShift() {
        int shift;
            do{
         shift = (int) (Math.random() * 10);
        return shift;
    }while(shift<=0 || shift>20);
            }

    /**
     * Encripts the atribute of the user
     *
     * @param keyword - keyword chosen by the user
     * @param atribute - atribute to be encripted
     * @param shift - number of deslocations wanted by the user
     * @return returns the encripted atribute
     */
    public static String cipherAttribute(String keyword, String atribute, int shift) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_', '@', '.', ','};
        String encripted = "";
        char[] clone = new char[letters.length];
        char[] key = keyword.toCharArray();
        char[] atrib = atribute.toCharArray();
        char ch;
        System.arraycopy(key, 0, letters, 0, keyword.length());
        System.arraycopy(letters, 0, clone, 0, letters.length);
        for (int j = 0; j < letters.length - (shift + 1); j++) {
            letters[j] = letters[j + shift];
        }
        int i = 0;
        for (int k = 0; k < shift + 1; k++) {
            letters[letters.length - (shift + 1) + i] = clone[k];
            i++;
        }
        for (int l = 0; l < atrib.length; l++) {
            char c = atrib[l];

            if (c == 'a' || c == 'A') {
                ch = letters[0];
                encripted += ch;
            }
            if (c == 'b' || c == 'B') {
                ch = letters[1];
                encripted += ch;
            }
            if (c == 'c' || c == 'C') {
                ch = letters[2];
                encripted += ch;
            }
            if (c == 'd' || c == 'D') {
                ch = letters[3];
                encripted += ch;
            }
            if (c == 'e' || c == 'E') {
                ch = letters[4];
                encripted += ch;
            }
            if (c == 'f' || c == 'F') {
                ch = letters[5];
                encripted += ch;
            }
            if (c == 'g' || c == 'G') {
                ch = letters[6];
                encripted += ch;
            }
            if (c == 'h' || c == 'H') {
                ch = letters[7];
                encripted += ch;
            }
            if (c == 'i' || c == 'I') {
                ch = letters[8];
                encripted += ch;
            }
            if (c == 'j' || c == 'J') {
                ch = letters[9];
                encripted += ch;
            }
            if (c == 'k' || c == 'K') {
                ch = letters[10];
                encripted += ch;
            }
            if (c == 'l' || c == 'L') {
                ch = letters[11];
                encripted += ch;
            }
            if (c == 'm' || c == 'M') {
                ch = letters[12];
                encripted += ch;
            }
            if (c == 'n' || c == 'N') {
                ch = letters[13];
                encripted += ch;
            }
            if (c == 'o' || c == 'O') {
                ch = letters[14];
                encripted += ch;
            }
            if (c == 'p' || c == 'P') {
                ch = letters[15];
                encripted += ch;
            }
            if (c == 'q' || c == 'Q') {
                ch = letters[16];
                encripted += ch;
            }
            if (c == 'r' || c == 'R') {
                ch = letters[17];
                encripted += ch;
            }
            if (c == 's' || c == 'S') {
                ch = letters[18];
                encripted += ch;
            }
            if (c == 't' || c == 'T') {
                ch = letters[19];
                encripted += ch;
            }
            if (c == 'u' || c == 'U') {
                ch = letters[20];
                encripted += ch;
            }
            if (c == 'v' || c == 'V') {
                ch = letters[21];
                encripted += ch;
            }
            if (c == 'w' || c == 'W') {
                ch = letters[22];
                encripted += ch;
            }
            if (c == 'x' || c == 'X') {
                ch = letters[23];
                encripted += ch;
            }
            if (c == 'y' || c == 'Y') {
                ch = letters[24];
                encripted += ch;
            }
            if (c == 'z' || c == 'Z') {
                ch = letters[25];
                encripted += ch;
            }
            if (c == '1') {
                ch = letters[26];
                encripted += ch;
            }
            if (c == '2') {
                ch = letters[27];
                encripted += ch;
            }
            if (c == '3') {
                ch = letters[28];
                encripted += ch;
            }
            if (c == '4') {
                ch = letters[29];
                encripted += ch;
            }
            if (c == '5') {
                ch = letters[30];
                encripted += ch;
            }
            if (c == '6') {
                ch = letters[31];
                encripted += ch;
            }
            if (c == '7') {
                ch = letters[32];
                encripted += ch;
            }
            if (c == '8') {
                ch = letters[33];
                encripted += ch;
            }
            if (c == '9') {
                ch = letters[34];
                encripted += ch;
            }
            if (c == '_') {
                ch = letters[35];
                encripted += ch;
            }
            if (c == '@') {
                ch = letters[36];
                encripted += ch;
            }
            if (c == '.') {
                ch = letters[37];
                encripted += ch;
            }
            if (c == ',') {
                ch = letters[38];
                encripted += ch;
            }
        }
        return encripted;
    }

    /**
     * encriptes the password with shifting
     *
     * @param password - password to be creapted
     * @param shift - number of deslocations
     * @return - returns the encripted password
     */
    public static String cipherWithShift(String password, int shift) {
        String encripted = "";
        int pass = password.length();
        for (int i = 0; i < pass; i++) {
            char c = (char) (password.charAt(i) + shift);
            if (c > 'z') {
                encripted += (char) (password.charAt(i) - (26 - shift));
            } else {
                encripted += (char) (password.charAt(i) + shift);
            }
        }
        return encripted;
    }

    /**
     *
     * @param password password
     * @param shift number of deslocations
     * @return the desencripted password
     */
    public static String decipherPassword(String password, int shift) {
        String encripted = "";
        int pass = password.length();
        for (int i = 0; i < pass; i++) {
            char c = (char) (password.charAt(i) - shift);
            if (c > 'z') {
                encripted += (char) (password.charAt(i) + (26 - shift));
            } else {
                encripted += (char) (password.charAt(i) - shift);
            }
        }
        return encripted;
    }

    /**
     * Verifys if the keyword is between 5 and 7 and if it has only letters
     *
     * @param keyword - keyword to verify size
     * @return
     */
    public static boolean verifyKeyword(String keyword) {
        char[] chars = keyword.toCharArray();
        if (chars.length > 15 || chars.length < 0) {
            return false;
        }

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return !(keyword.length() > 7 || keyword.length() < 5);
    }

    /**
     *
     * @param user user
     * @param fc fair center
     * @return the keyword of the user
     */
    public static String verifyEncryptionUserGetKeyword(User user, FairCenter fc) {
        String kw = "";
        for (Encryption e : fc.getEncryptionList().getEncryptionsList()) {
            if (e.getUser().equals(user)) {
                kw = e.getKeyword();
            }
        }
        return kw;
    }

    /**
     *
     * @param user user
     * @param fc fair center
     * @return the user shift number
     */
    public static int verifyEncryptionUserGetShift(User user, FairCenter fc) {
        int shift = 0;
        for (Encryption e : fc.getEncryptionList().getEncryptionsList()) {
            if (e.getUser().equals(user)) {
                shift = e.getShift();
            }
        }
        return shift;
    }
}

package facadeProg;
import java.util.*;
public class Client {
    /**
     * @param String[] 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Do you have Gift Certificate?(Y or N)");
    	String s = sc.nextLine();
    	boolean a = (s.equals("Y") || s.equals("y"))?true:false;
        Facade f = new Facade(a, 100);
        f.displayItemsPurchased();
        f.calculateAmountToPay();
    }

}

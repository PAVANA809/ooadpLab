
import java.util.*;

public class Client {
    /**
     * @param String[] 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
        Facade f = new Facade(false, 100);
        f.displayItemsPurchased();
        f.calculateAmountToPay();
    }

}
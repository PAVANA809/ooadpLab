package facadeProg;
import java.util.*;

public class ProcessSales {

  
    public boolean giftCert;
    public int numItems;
    public float billAmount;

    /**
     * @param boolean 
     * @param int 
     * @param float
     */
    ProcessSales(boolean b, int i,float f) {
        // TODO implement here
        this.giftCert = b;
        this.numItems = i;
        this.billAmount = f;
    }

    /**
     * @return
     */
    public void processSale() {
        // TODO implement here
    	Scanner sc = new Scanner(System.in);
        if (!giftCert) {
            System.out.println("You don't have Gift Certificate!");
            System.out.println("Amount Payable: "+billAmount);
        } else {
            System.out.print("Enter Gift Certificate Value:");
            float certValue = Float.parseFloat(sc.nextLine());
            if(numItems <=0)
                System.out.println("No Items in Cart!");
            else if(numItems > 1)
                System.out.println("Only one item can be purchased using Gift Certificate!");
            else if(billAmount > certValue)
                System.out.println("Please pay balance amount in Cash:"+(billAmount - certValue) );
            else if(billAmount < certValue)
                System.out.println("No cashback will be refunded! ThankYou for your Purchase!");
        }
    }

}
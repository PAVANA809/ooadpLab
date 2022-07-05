package adapterProg;
import java.util.*;

public class TaxAdapterDemo {

    TaxAdapterDemo() {
        // TODO implement here
    }

    /**
     * @param String[] 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
    	Scanner sc = new Scanner(System.in);
    	CalcTax ct= new MyMauritiusTax();
//    	System.out.println(ct.taxAmount(1, 100));
    	System.out.println("Enter product name: ");
    	String s = sc.nextLine();
    	System.out.println("Enter price: ");
    	float price = Float.parseFloat(sc.nextLine());
    	Item il = new Item(s,price,ct);
    	System.out.println("Enter Quantity: ");
    	int q = Integer.parseInt(sc.nextLine());
    	il.setQuantity(q);
    	il.printPrice();
    	il.setTax(new SwedenTax());
    	il.printPrice();
    }

}
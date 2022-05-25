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
    	CalcTax ct= new MyMauritiusTax();
    	System.out.println(ct.taxAmount(1, 100));
    	Item il = new Item("Cycle",100,ct);
    	il.setQuantity(2);
    	il.printPrice();
    	il.setTax(new SwedenTax());
    	il.printPrice();
    }

}
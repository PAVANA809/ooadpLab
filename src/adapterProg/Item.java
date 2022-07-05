package adapterProg;
import java.util.*;

public class Item {

    public String name;
    public double price;
    public int qty;
    public double billAmount;
    public CalcTax ct;

    /**
     * @param String 
     * @param double 
     * @param CalcTax
     */
    Item(String s, double d, CalcTax ct) {
        // TODO implement here
    	this.name = s;
    	this.price = d;
    	this.ct = ct;
    }

    /**
     * @param CalcTax 
     * @return
     */
    public void setTax(CalcTax c) {
        // TODO implement here
    	this.ct = c;
    }

    /**
     * @param int 
     * @return
     */
    public void setQuantity(int i) {
        // TODO implement here
    	this.qty = i;
    }

    /**
     * @return
     */
    public void printPrice() {
        // TODO implement here
    	System.out.println("\nName: "+name);
    	System.out.println("Quantity: "+qty);
    	System.out.println("Price: "+price);
    	double tax = ct.taxAmount(qty, price);
    	billAmount = (qty*price) + tax;
    	System.out.println("Tax Amount: "+tax);
    	System.out.println("BillAmount: "+billAmount);
    }

}
package adapterProg;
import java.util.*;


public class MyMauritiusTax implements CalcTax {

    public double tax_amount;

    MyMauritiusTax() {
        // TODO implement here
    }
    NewMauritiusTax mt = new NewMauritiusTax();
    /**
     * @param String 
     * @param int 
     * @param double 
     * @return
     */
    @Override
    public double taxAmount(int i, double d) {
        // TODO implement here
        return mt.calcTax(i,d);
    }

}
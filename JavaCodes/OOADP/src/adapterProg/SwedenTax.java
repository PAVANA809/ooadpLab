package adapterProg;
import java.util.*;

public class SwedenTax implements CalcTax {

    SwedenTax() {
        // TODO implement here
    }

    /**
     * @param String 
     * @param int 
     * @param double 
     * @return
     */
    public double taxAmount(int i, double d) {
        // TODO implement here
        return i*d*0.18f;
    }

}
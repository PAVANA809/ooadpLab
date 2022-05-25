package facadeProg;
import java.util.*;

public class ItemsPurchased {

    public HashMap<String,Integer> Items;
    public Scanner scan;
    public int itemTypes;
    public String iname;
    public Integer iqty;

    public ItemsPurchased() {
        // TODO implement here
       
        Items = new HashMap<String, Integer>();
        storeItemsPurchasedDetails();
    }

    public int getNumItemTypes() {
        // TODO implement here
        return itemTypes;
    }

    public void getItemPurchased() {
        // TODO implement here
        System.out.println("Items Purchased:");
        Set<Map.Entry<String, Integer>> set = Items.entrySet();
        for (Map.Entry<String, Integer> i : set) {
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }

    public void storeItemsPurchasedDetails() {
        // TODO implement here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of types of Items: ");
        itemTypes = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= itemTypes; i++) {
            System.out.println("Enter name of item " + i);
            iname = sc.nextLine();
            System.out.println("Enter the quantity of item " + i+":");
            iqty = Integer.parseInt(sc.nextLine());
            Items.put(iname, iqty);
        }
    }

}
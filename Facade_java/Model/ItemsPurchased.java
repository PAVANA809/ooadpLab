import java.util.*;

/**
 * 
 */
public class ItemsPurchased {

    public HashMap<String,Integer> Items;
    public Scanner scan;
    public int itemTypes;
    public String iname;
    public Integer iqty;

    String name;

    public ItemsPurchased() {
        // TODO implement here
        System.out.println("here iam");
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
        System.out.println("Enter number of types of Items: ");
        itemTypes = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= itemTypes; i++) {
            System.out.println("Enter name of item " + i);
            name = sc.nextLine();
            System.out.println("Enter the quantity of item " + i);
            iqty = sc.nextInt();
            Items.put(name, iqty);
        }
    }

}
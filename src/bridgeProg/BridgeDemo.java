package bridgeProg;
import java.util.*;
public class BridgeDemo 
{

  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter total number of customers");
    int i=sc.nextInt();
    sc.nextLine();
    while(i>0)
    {
      System.out.println("\n\nEnter the name of the customer");
      String name=sc.nextLine();
      System.out.print("Age - ");
      int age=sc.nextInt();
      System.out.println("Are you a First time customer?\n1 for yes,0 for no");
      int opt=sc.nextInt();
      sc.nextLine();

      if(opt==1)
      {
        Customer c2=new FTCCustomer(name, age, new Discount1());
        System.out.print("Enter the bill amount - ");
        float bill=sc.nextFloat();
        sc.nextLine();
        c2.showBill(bill);
        
        c2.setDiscount(new Discount2());
        c2.showBill(bill);
        
        c2.setDiscount(new Discount3());
        c2.showBill(bill);
        
        c2.setDiscount(new Discount4());
        c2.showBill(bill);
      }
      else if(opt==0 && age<60)
      {
        Customer c1=new RCCustomer(name, age, new Discount1());
        System.out.print("Enter the bill amount - ");
        float bill=sc.nextFloat();
        sc.nextLine();
        c1.showBill(bill);
        
        c1.setDiscount(new Discount2());
        c1.showBill(bill);
        
        c1.setDiscount(new Discount3());
        c1.showBill(bill);
        
        c1.setDiscount(new Discount4());
        c1.showBill(bill);
      }
      else
      {
        Customer c2=new SSCustomer(name, age, new Discount1());
        System.out.print("Enter the bill amount - ");
        float bill=sc.nextFloat();
        sc.nextLine();
        c2.showBill(bill);
        
        c2.setDiscount(new Discount2());
        c2.showBill(bill);
        
        c2.setDiscount(new Discount3());
        c2.showBill(bill);
        
        c2.setDiscount(new Discount4());
        c2.showBill(bill);
      }
      i--;
    }
    
  }
}

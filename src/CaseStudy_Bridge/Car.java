package CaseStudy_Bridge;

public abstract class Car {

	   private Product product;
	   private String carType;
	   
	   public Car(Product product,String carType){
	       this.product = product;
	       this.carType = carType;
	       }
	   
	   public abstract void assemble();
	   
	   public abstract void produceProduct();
	   
	   public void printDetails(){
	       System.out.println("\nCar Name : "+ carType +"Product Name : "+product.productName());
	   }
	}
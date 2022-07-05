package CaseStudy_Bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheelCar(product , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new BigWheelCar(product2 , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new MotorenCar(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new MotorenCar(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        }
}
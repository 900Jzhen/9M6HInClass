package CarinheritanceDemo;

public class CarTester {
    public static void main(String[] args){
        Vehicle vh = new Vehicle("yyy4444");
        Car car  = new Car("yyy3333",4,"Sedan");

        //vh.setLicensePlate("xyz8888");



        System.out.println(vh);
       // car.setLicensePlate("aaa7777");
        System.out.println(car);
    }
}

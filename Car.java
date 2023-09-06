package CarinheritanceDemo;

public class Car extends Vehicle {

    private int numberOfWheels;
    private String typeOfCar;

    //public Car(int nW, String tC) {
    //    this.numberOfWheels = nW;
    //    this.typeOfCar = tC;
    //}

    public Car(String lP){
        super(lP);
    }

    public Car(String lP, int nW, String tC){
        super(lP);
        this.numberOfWheels = nW;
        this.typeOfCar = tC;
    }

/*    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }
*/

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String toString() {
        return "From Car class: " + super.getLicensePlate() + "Car: Number of Wheels: " + numberOfWheels + ", Type of Car: " + typeOfCar;
    }
}

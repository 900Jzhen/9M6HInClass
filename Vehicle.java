package CarinheritanceDemo;

//demo about inheritance

//superclass
public class Vehicle {



    private  String licensePlate;

    public Vehicle(String lP){
        this.licensePlate = lP;

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String toString(){
        return "From Vehicle class: License Plate: " + licensePlate;
    }
}

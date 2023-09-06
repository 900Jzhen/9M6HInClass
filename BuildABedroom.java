package BuildABedroom;

public class BuildABedroom {
    public static void main(String[] args){

        //public wall
        Wall wl1 = new Wall("East");
        Wall wl2 = new Wall("West");
        Wall wl3 = new Wall("North");
        Wall wl4 = new Wall("South");
        //public Ceiling
        Ceiling ceiling = new Ceiling(1,1,"black");

        //public Bed
        Bed bed = new Bed("Wooden Style",21,2,"King");

        //public Lamp
        Lamp lamp = new Lamp("Cloud Shape",18,200,"orange",14);

        Bedroom truing = new Bedroom("Trung's Bedroom",wl1,wl2,wl3,wl4,ceiling,bed,lamp);

        truing.makeBed();

        lamp.onOff(true);
        truing.getLamp().onOff(false);
    }
}

package BuildAPC;

public class BuildAPC {
    public static void main(String[] args){

        Dimension dimension = new Dimension(1,2,3);

        Resolution resolution = new Resolution(1,2);

        Case thecase = new Case("231","NVIDIA", dimension);

        Monitor monitor = new Monitor("113","ROG",resolution);

        Motherboard motherboard = new Motherboard("432","GGG","i7",16,"xxx",32);

        PC jonPC = new PC(thecase,motherboard,monitor);

        jonPC.makePC();





    }
}

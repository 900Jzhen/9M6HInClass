package BuildABedroom;

public class Lamp {
    private String shape;
    private int height;
    private int lumens;
    private String color;
    private int numberOfBulbs;

    public Lamp(String shape, int height, int lumens, String color, int numberOfBulbs) {
        this.shape = shape;
        this.height = height;
        this.lumens = lumens;
        this.color = color;
        this.numberOfBulbs = numberOfBulbs;
    }

    private boolean switchTurn;//false

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfBulbs() {
        return numberOfBulbs;
    }

    public void setNumberOfBulbs(int numberOfBulbs) {
        this.numberOfBulbs = numberOfBulbs;
    }

    public void onOff(boolean switchTurn){
        this.switchTurn = switchTurn;
        if(switchTurn){
            System.out.println("Light is on");
        }
        else{
            System.out.println("Light is Off");
        }
    }
}

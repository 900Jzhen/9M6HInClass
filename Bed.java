package BuildABedroom;

public class Bed {

    private String style;
    private int numberOfPillows;
    private int numberOfSheets;
    private String size;

    public Bed(String style, int numberOfPillows, int numberOfSheets, String size) {
        this.style = style;
        this.numberOfPillows = numberOfPillows;
        this.numberOfSheets = numberOfSheets;
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void make(){
        System.out.println("From Bed Class: Make the bed...");
    }
}

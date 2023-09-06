package BuildAPC;

import java.awt.*;

public class Case {

    private String model;
    private String manufacturer;
    private Dimension dimension;

    public Case(String model, String manufacturer, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void make(){
        System.out.println("From Case Class: Make Case");
    }
}

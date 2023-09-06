package BuildAPC;

public class PC {
    private Case thecase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case thecase, Motherboard motherboard, Monitor monitor) {
        this.thecase = thecase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getThecase() {
        return thecase;
    }

    public void setThecase(Case thecase) {
        this.thecase = thecase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void makePC(){
        System.out.println("From PC Class: make Case...");
        this.make();
       thecase.make();

    }

    public void make(){
        System.out.println("FROM PC class: PC is making ... ");
    }
}

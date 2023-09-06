package Animal;

public class Bird extends Animal{

    int wingSpan;
    //String color;

    public Bird(/*int ws*/){
        super(1,"blue",1);
       /* this.wingSpan = ws;*/
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Bird(int wingSpan,int age, String color, int weight){
        super(age,color,weight);
        this.wingSpan = wingSpan;
        return;
    }

    public void fly(){
        System.out.println("From Bird class: Flying.");
    }

    @Override
    public void eat() {
        System.out.println("From Bird class: A bird eats worms.");
    }
}

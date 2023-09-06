package Animal;

public class Zoo {
    public static void main(String[] args){
        Animal a1 = new Animal(2,"blue",2);
        a1.eat();
        System.out.println(a1);

        Bird b1 = new Bird();
        b1.eat();
    }

}

package Animal;

public class Animal {

    int age;
    int weight;
    String color;

    public Animal(int age,String color, int weight){
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

public  void eat(){
    System.out.println("From animal Class:eating.");
}

public void sleep(){
    System.out.println("From animal class:sleeping.");
}
}

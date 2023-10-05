public class Hierarchical {
    public static void main(String args[]){
        Lion lion = new Lion();
        lion.sound();

        Goat goat = new Goat();
        goat.sound();
        
        float f = 5050/100f;
        System.out.println(f);
    }    
}

abstract class Animal{
    String species;
    static boolean animal = true;
    int population;

    abstract void sound();

}

class Lion extends Animal {

    void sound(){
        System.out.println("Rawr");
    }
}

class Goat extends Animal {
    void sound(){
        System.out.println("meeeahhh");
    }
}
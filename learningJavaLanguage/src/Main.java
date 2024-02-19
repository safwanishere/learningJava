import java.io.Console;
import static java.lang.System.*;

public class Main{
    public static void main(String args[]){
        out.println("hello");
    }
}

class Car{
    String brand;
    String fuel;
    static int wheels = 4;
}

class CyberTruck extends Car{
    String brand = "Tesla";
    String fuel = "electric";
}

class Corvette extends Car{
    String brand = "Chevrolet";
    String fuel = "petrol";
}
import java.io.Console;

public class Main{
    public static void main(String args[]){
        CyberTruck ct = new CyberTruck();
        System.out.println(CyberTruck.wheels);

        Console console = System.console();
        if (console != null) {
            // Reading input from the console
            String inputLine = console.readLine("Enter something: ");
            char[] password = console.readPassword("Enter password: ");
            // Writing output to the console
            console.writer().println("You entered: " + inputLine);
            console.writer().println("Your password: " + new String(password));
        } else {
            System.out.println("Console is not available.");
        }
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
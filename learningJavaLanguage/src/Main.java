import java.io.Console;

public class Main{
    public static void main(String args[]){
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
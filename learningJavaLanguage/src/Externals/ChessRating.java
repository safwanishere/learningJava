import java.util.Scanner;
public class ChessRating {
    //take two input integers x and y, count the number if times x must be inremented to reach y if it increases by 8 each time
    
    //input: 5 20    output: he must win 2 games to reach 20 rating

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;
        
        for (int i=0; x<y ; i++){
            x = x+8;
            count++;
        }
        System.out.println("he must win "+ count +" games to reach "+ y +" rating");
    }
}

public class CozaLozaWoza {
    public static void main(String args[]){
        final int lowerBound = 1, upperBound = 110;
        for (int i = lowerBound; i <= upperBound; i++){
            if (i%3==0){
                System.out.print("Coza");
            }
            if (i%5==0){
                System.out.print("Loza");
            }
            if (i%7==0){
                System.out.print("Woza");
            }
            if (i%3!=0 && i%5!=0 && i%7!=0){
                System.out.print(i);
            }
            if (i%11==0){
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
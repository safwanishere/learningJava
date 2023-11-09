public class Product1ToN {
    public static void main(String args[]){
        long number = 1L;
        int LowerBound = 1;
        int UpperBound = 14;
        
        for (int i = LowerBound; i <= UpperBound; i++){
            number *= i;
        }
        System.out.println("factorial is: "+number);
    }
}

public class SumOfSquares{
    public static void main(String args[]){
        int lowerBound = 1, upperBound = 100, sum = 0;

        for (int i = lowerBound; i <= upperBound; i++){
            sum += i*i;
        }

        System.out.println("sum: " + sum);
    }
}
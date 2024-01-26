public class SumAverageRunningInt{
    public static void main(String args[]){
        int lowerBound = 1, upperBound = 1000, sum = 0, count = 0;

        for (int i = lowerBound; i <= upperBound; i++){
            sum += i;
            count++;
        }

        System.out.println("sum: " + sum + "\naverage: " + (float) (sum)/count);
    }
}
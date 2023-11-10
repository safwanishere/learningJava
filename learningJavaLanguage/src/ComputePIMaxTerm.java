public class ComputePIMaxTerm {
    public static void main(String args[]){
        int maxTerm = 10000;
        double sum = 0.0;

        for (int term = 1; term <= maxTerm; term++){
            if (term % 2 == 1){
                sum += (double)(1)/(term*2-1);
            }
            else{
                sum -= (double)(1)/(term*2-1);
            }
        }

        double Pi = (double)(4)*sum;
        System.out.println("Pi value: " + Pi);

        System.out.println("comparison: "+((Pi/Math.PI)*100));
    }
}

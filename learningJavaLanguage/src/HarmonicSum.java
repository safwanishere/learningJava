public class HarmonicSum {
    public static void main(String args[]){
        final int maxDenominator = 50000;

        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int i = 1; i <= maxDenominator; i++){
            sumL2R += (double)(1)/i;
        }
        for (int j = maxDenominator; j >= 1; j--){
            sumR2L += (double)(1)/j;
        }

        System.out.println("the sum from left to right: "+sumL2R);
        System.out.println("the sum from right to left: "+sumR2L);

        if (sumL2R > sumR2L){
            absDiff = sumL2R - sumR2L;
        }
        else{
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("absolute difference: "+absDiff);
    }
}

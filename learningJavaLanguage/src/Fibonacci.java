public class Fibonacci {
    public static void main(String args[]){
        int n = 3, fn, f1 = 1, f2 = 1, nMax = 20, sum=0;

        System.out.println("The first "+ nMax + " Fibonacci numbers are: ");
        System.out.print(0+" "+1+" "+1+" ");

        while (n<= nMax){
            n++;
            fn = f1 + f2;
            sum += fn;
            System.out.print(fn+" ");
            f1 = f2;
            f2 = fn;
        }

        System.out.println("\nThe average is "+(double)(sum)/(nMax));
    }
}

public class GCD{
    public static void main(String[] args){
        System.out.println(gcd(40, 16));
    }

    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        else if (b>0){
            return gcd(b, a%b);
        } else {
            return -1;
        }
    }
}
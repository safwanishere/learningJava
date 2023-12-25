public class RunningNumber{
    public static void main(String[] args){
        System.out.println(len(13));
    }

    public static int len(int n){
        if (n==1){
            return 1;
        } else { 
            return len(n-1) + numOfDigits(n);
        }
    }

    public static int numOfDigits(int num){
        int count = 0;
        for (int i = num; i>0; i/=10){ count++; }
        return count;
    }
}
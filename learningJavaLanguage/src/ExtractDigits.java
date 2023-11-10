public class ExtractDigits {
    public static void main(String args[]){
        int n = 15423, digit;

        while (n>0){
            digit = n % 10;
            n /= 10;
            System.out.print(digit + " ");
        }
    }
}

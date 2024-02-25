import java.util.Scanner;

public class StringComparison{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1<len2){
            int temp = len1;
            len1 = len2;
            len2 = temp;

            String temps = s1;
            s1 = s2;
            s2 = temps;
        }

        for(int i = 1; i<=len1; i++){
            character char1 = s1.charAt(i);
            for (int j = 1; j<=len2; j++){
                if ()
            }
        }

        System.out.println(s1.length());
        System.out.println(s2);
    }
}
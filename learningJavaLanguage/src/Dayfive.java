import java.util.*;

public class Dayfive {
    public static void main(String args[]){
        // int i,j;

        // for (i=0; i<3; i++){
        //     for (j=0; j<3; j++){
        //         System.out.print(i+""+j+" ");
        //     }
        //     System.out.print("\n");
        // }

        // System.out.println("*\t*\t*\t \n\n\n *\t\t*\t \n\n\n *\t*\t*\t");

        // String s = new String("hello");
        // String s2 = new String(" world");

        // System.out.println(s.charAt(2)); // prints the character at index
        // System.out.println(s.length());  // prints the length of the string
        // System.out.println(s.indexOf("o"));  // prints the index of given character in the string
        // System.out.println(s.toUpperCase());  // prints the string in all caps
        // System.out.println(s.toLowerCase());  // prints the string in all lowercase letters
        // System.out.println(s.concat(s2));  // prints true or false depending on if the strings are the same

        // float array[] = {6.78f, 42.3f, 7.8f, 69.420f, 90.65f};
        // for (int i = 0; i<5; i++){
        //     System.out.println(array[i]);	
        // }
        
        // Scanner scan = new Scanner(System.in);

        // int inputNum = scan.nextInt();

        // for(int i = 1; i<=inputNum; i++){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Scanner scan = new Scanner(System.in);

        // int inputNum = scan.nextInt();

        // for (int i = 0; i<inputNum; i++){
        //             for(int j = 0; j<inputNum; j++){
        //                 if (i+j == (inputNum-1) || i==j){
        //                     System.out.print("*");
        //                 }         else{
        //                     System.out.print("  ");
        //                 }
        //             }
        //             System.out.println();
        //         }


        // Scanner scan = new Scanner(System.in);

        // String inputStr = scan.next();
        // System.out.println("length of the string: "+inputStr.length());
        // System.out.println("uppercase: " + inputStr.toUpperCase());
        // System.out.println("lowercase: " + inputStr.toLowerCase()+ "\n");

        // System.out.println("hello".compareTo("ell"));

        // int marks[] = {69,98,57,63,64};
        // int i, sum = 0;
        // for  (i=0; i<5; i++){
        //     sum += marks[i];
        // }
        // System.out.println(sum);

        // int[] arr = {1,7,45,22,56,90,21,64,5,19};
        // int even = 0, odd = 0;
        // for (int i =0; i<10; i++){
        //     if (arr[i]%2 == 0){
        //         even += 1;
        //     }
        //     else{
        //         odd +=1;
        //     }
        // }
        // System.out.println("even count is: " + even + "\nodd count is: " + odd);

        int arr[] = {1,7,45,22,56,90,21,64,5,19};
        int max = arr[0], min =arr[0];
        
        for(int i=0; i<10; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max value is: " + max);

        for(int i=0; i<10; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min value is: " + min);

    }
}
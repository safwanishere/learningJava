import java.util.*;
public class ABK{
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int num[]=new int[size];
        // int position = 0;

        // for(int i=0;i<size;i++){
        //     num[i]=sc.nextInt();
        // }

        // int target = sc.nextInt();

        // for(int i=0;i<size;i++){
        //     if (num[i] == target){
        //         position = i;
        //         break;
        //     } else {
        //         position = -1;
        //     }
        // }

        // System.out.println(position);

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        int min = 1000, sum = 0;
        
        for (int i = 0; i<size; i++){
            array[i] = scan.nextInt();
            
            if (array[i] < min){
                min = array[i];
            }

            sum += array[i];
        }

        if (array.length>2){
            System.out.println(sum-min);
        } else {
            System.out.println(sum);
        }
        
    }
}
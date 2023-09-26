import java.util.*;

class Daysix{
    public static void main(String args[]){
        // int i,j;
        // for (i=0; i<5; i++){
        //     for (j=0; j<5; j++){
        //         System.out.print(i+""+j);
        //     }
        // }

        Scanner scan = new Scanner(System.in);
		
		// System.out.print("Enter array size: ");
		// int size = scan.nextInt();
		
		// int userArray[] = new int[size];

		// for (int i=0; i<size; i++){
		// 	System.out.print("Enter array element of index "+ i + " : ");
		// 	userArray[i] = scan.nextInt();
		// 	System.out.println(); 
		// } 
		
		// System.out.println("This is your array: ");
		// for (int i=0; i<size; i++){
		// 	System.out.println(userArray[i]);
		// }

        // System.out.println();

        // int zeroCount = 0;

        // for (int i=0; i<size; i++){
        //     if (userArray[i] == 0){
        //         zeroCount += 1;
        //     }
        // }

        // System.out.println("number of zeroes in your array are: "+zeroCount);
        // System.out.println();

        // int evenCount = 0, oddCount = 0;
        // for (int i =0; i<size; i++){
        //     if (userArray[i]%2 == 0 && userArray[i] != 0){
        //         evenCount += 1;
        //         System.out.println("even number at index "+i+" : "+userArray[i]);
        //     } else if (userArray[i]%2 != 0){
        //         oddCount += 1;
        //         System.out.println("odd number at index "+i+" : "+userArray[i]);
        //     }
        // }

        // System.out.println("number of even numbers in your array: " + evenCount);
        // System.out.println("number of odd numbers in your array: " + oddCount);
        // System.out.println();

        // int sum = 0;
        // for (int i = 0; i<size; i++){
        //     sum += userArray[i];
        // }

        // System.out.println("sum of the array: " + sum);

        // scan.close();

        // int array2D[][] = {{4, 5, 0}, {9, 8, 7}};
        // System.out.println(array2D[0][1]);
        
        // int a=10;
        // int b=20;
        // int ch = scan.nextInt();
        // switch(ch){
        //     case 1:
        //     System.out.println(a+b);
        //     break;
        //     case 2: 
        //     System.out.println(a-b);
        //     break;
        //     case 3: 
        //     System.out.println(a*b);
        //     break;
        //     case 4: 
        //     System.out.println(a/b); 
        //     break;
        //     default:
        //     System.out.print("incorrect choice");

        // }
        
        // int [][] arr= new int [3][3];
        // for(int i=0; i<3; i++){
        //     for (int j=0; j<3; j++){
        //         System.out.print("enter your element ");
        //         arr[i][j]=scan.nextInt();
        //     }
        // }

        // for (int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        // int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // int arrTranspose[][] = new int[3][3];

        // for (int i=0; i<3; i++){
        //     for (int j=0; j<3; j++){
        //         arrTranspose[i][j] = arr[j][i];
        //     }
        // }

        // for (int i=0; i<3; i++){
        //     for (int j=0; j<3; j++){
        //         System.out.print(arrTranspose[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        int arr[][] = {{1,2},{3,4}};
        int arr2[][] = {{5,6},{7,8}};

        int arrSum[][] = new int[2][2];

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                arrSum[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(arrSum[i][j]+ "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}
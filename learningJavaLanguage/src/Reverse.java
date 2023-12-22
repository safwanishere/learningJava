public class Reverse{
    public static void main(String args[]){
        int[] array = new int[3];
        array[0] = 2;
        array[1] = 7;
        array[2] = 4;
        
        reverse(array);
    }

    public static void reverse(int[] array){
        int len = array.length;
        int[] returnArray = new int[len];

        for (int i = 0; i<len; i++){
            int j = len-1-i;
            returnArray[i] = array[j];
        }

        for(int i = 0; i<len; i++){
            System.out.print(returnArray[i] + " ");
        }
    }
}
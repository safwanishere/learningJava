public class CopyOf{
    public static void main(String args[]){
        int[] array = new int[3];
        array[0] = 9;
        array[1] = 8;
        array[2] = 4;

        System.out.println(array);
        System.out.print(copyOf(array));
    }

    public static int[] copyOf(int[] array){
        int len = array.length;
        int[] returnArray = new int[len];

        for (int i = 0; i<len; i++){
            returnArray[i] = array[i];
        }
        return returnArray;
    }
}
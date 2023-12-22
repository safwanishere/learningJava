public class Array2String{
    public static void main(String args[]){
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 6;
        array[2] = 4;
        array[3] = 9;

        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] array){
        String output = "";
        int len = array.length;

        output += "[";
        for (int i = 0; i<len; i++){
            output += array[i];
            if (i != len-1){
                output += ",";
            }
            output += " ";
        }
        output += "]";

        return output;
    }
}
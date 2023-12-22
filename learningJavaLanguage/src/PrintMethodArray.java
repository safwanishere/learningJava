public class PrintMethodArray{
    public static void main(String args[]){
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 6;
        array[2] = 4;
        array[3] = 9;

        print(array);
    }

    public static void print(int[] array){
        int len = array.length;

        System.out.print("[");
        for (int i = 0; i<len; i++){
            System.out.print(array[i]);
            if (i != len-1){
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.print("]");
    }
}
public class Contains{
    public static void main(String args[]){
        int[] array = {1,6,2,9};
        //new int[4];
        // array[0] = 1;
        // array[1] = 6;
        // array[2] = 4;
        // array[3] = 9;

        int key = 2;

        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key){
        int len = array.length;

        for (int i = 0; i<len; i++){
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }
}
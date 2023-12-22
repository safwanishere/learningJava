public class Search{
    public static void main(String args[]){
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 6;
        array[2] = 4;
        array[3] = 9;

        int key = 4;

        System.out.println(search(array, key));
    }

    public static int search(int[] array, int key){
        int len = array.length;

        for (int i = 0; i<len; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
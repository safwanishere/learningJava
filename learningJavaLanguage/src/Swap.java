public class Swap{
    public static void main(String args[]){
        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 7;
        array1[2] = 4;
        array1[3] = 9;

        int[] array2 = new int[4];
        array2[0] = 6;
        array2[1] = 1;
        array2[2] = 2;
        array2[3] = 3;

        System.out.println(swap(array1, array2));
    }

    public static boolean swap(int[] array1, int[] array2){
        int len1 = array1.length;
        int len2 = array2.length;
        int temp;

        if (len1 == len2){
            for (int i = 0; i<len1; i++){
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        } else {
            return false;
        }
    }
}
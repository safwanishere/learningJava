public class Equals{
    public static void main(String args[]){
        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 6;
        array1[2] = 4;
        array1[3] = 9;

        int[] array2 = new int[4];
        array2[0] = 1;
        array2[1] = 6;
        array2[2] = 2;

        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2){
        int len1 = array1.length;
        int len2 = array2.length;

        if (len1 == len2){
            for (int i = 0; i<len1; i++){
                if (array1[i] == array2[i]){
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
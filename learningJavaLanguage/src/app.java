public class app {
    public static void main(String args[]){
        Math math = new Math();

        System.out.println(math.add(2,2));
        System.out.println(math.add(1,2,2));

        Numbers numbers = new Numbers();

        System.out.println(numbers.add(1,2));
    }
}

class Math {
    public int add(int x, int y){
        return x + y;
    }
    public int add(int x, int y, int z){
        return x + y + z;
    }
}

class Numbers extends Math{
    public int add(int x, int y, int z, int a){
        return x + y + z + a;
    }
    public int add(int x, int y){
        return x + x;
    }
}
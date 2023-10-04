public class Abstraction {
    public static void main(String args[]){
        LightWeight lv = new LightWeight();
        HeavyWeight hv = new HeavyWeight();

        lv.engine();
        hv.engine();
    }
}

abstract class SportBike{
    abstract void engine();
}
class LightWeight extends SportBike{
    public void engine(){
        System.out.println("bike cc is 200");
    }
}
class HeavyWeight extends SportBike{
    public void engine(){
        System.out.println("bike cc is 500");
    }
}
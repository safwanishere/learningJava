public class Inheritance {
    public static void main(String args[]){
        GrandParent gp = new GrandParent();
        gp.age = 78;

        Parent p = new Parent();
        p.age = 45;

        Child c = new Child();
        c.age = 18;

        Baby b = new Baby();
        b.age = 2;

        System.out.println(gp.age);
        System.out.println(gp.gen);

        System.out.println(p.age);
        System.out.println(p.gen);

        System.out.println(c.age);
        System.out.println(c.gen);

        System.out.println(b.age);
        System.out.println(b.gen);
    }
}

class GrandParent{
    int age;
    static int gen = 1;
}

class Parent extends GrandParent{
    static int gen = 2;
}

class Child extends Parent{
    static int gen = 3;
}

class Baby extends Child{
    static int gen = 4;
}
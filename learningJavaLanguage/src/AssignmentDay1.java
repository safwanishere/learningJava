public class AssignmentDay1 {
    public static void main(String args[]){
        // Arithmetic Operators
        System.out.println(56 + 12);
        System.out.println(45 - 82);
        System.out.println(55 * 2);

        // Assignment operators
        int a = 56;
        a += 4;
        System.out.println(a);

        int b = 25;
        b -= 5;
        System.out.println(b);

        int c = 10;
        c *= 43;
        System.out.println(c);

        // Relational Operators
        System.out.println(67 == 89);
        System.out.println(56 > 12);
        System.out.println(34 < 9);

        // Logical operators
        System.out.println(45==44);
        System.out.println(90<67 || 78>=23);
        System.out.println(!(67 == 65));

        // Unary operators
        int d = 15;
        System.out.println(d++);
        System.out.println(++d);
        System.out.println(--d);

        // Bitwise operators
        System.out.println(3 & 5);
        System.out.println(2 | 4);
        System.out.println(7 ^ 6);

        System.out.println("1 + 2 = "  + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));
    }
}

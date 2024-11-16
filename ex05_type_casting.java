public class ex05_type_casting {
    public static void main(String[] args) {
    //Convert from high to low
        int numInt = 10;
        double numDouble = numInt;
        System.out.println("numInt is " + numInt);
        System.out.println("convert form numInt to numDouble is " + numDouble);

    //Convert from low to high  
        double numDoublee = 55.0;
        int numIntt =(int)numDoublee;
        System.out.println("numDoublee is " +numDoublee);
        System.out.println("convert form numDoublee to numIntt is " + numIntt);

     //Convert from String to Integer and integer to string
        String a1 = "100", b1 = "200";
        String a2 = "20", b2 = "20";
        int c ,d, e;
        c = Integer.parseInt(a1) + Integer.parseInt(b1);
        d = Integer.valueOf(a2) + Integer.valueOf(b2);
        e = 20 + Integer.parseInt(a1);

        String f, g, h;
        f = String.valueOf(c);
        g = String.valueOf(d);
        h = String.valueOf(e);

        Double i, j;
        i = Double.valueOf(c) + 5.55;
        j = Double.valueOf(d) + 105;

        System.out.println("a1 is " + a1);
        System.out.println("b1 is " + b1);
        System.out.println("a1 + b1 = " + c );
        System.out.println("a2 + b2 = " + d );
        System.out.println("a1 + e = " + e);
        System.out.println("convert number `c` to string " + f );
        System.out.println("convert number `d` to string " + g);
        System.out.println("convert number `e` to string " + h );
        System.out.println("convert number `c` to double + 5.55 = " + i );
        System.out.println("convert number `d` to double + 105 = " + j );
    }
}

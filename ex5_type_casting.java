public class ex5_type_casting {
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
    }
}

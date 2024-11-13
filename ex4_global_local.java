public class ex4_global_local {

    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        {
            int c = 36;
            System.out.println("value 'c' is "+ c);
            System.out.println("value 'a' is "+ a);
        }
        System.out.println("value 'a' is "+ a);
        System.out.println("value 'b' is "+ b);
    }
}
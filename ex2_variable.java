public class ex2_variable {
    public static void main(String[] args) {
        String name = "Bank ";
        System.out.println(name);

        int scores1 = 89;
        System.out.println(scores1);

        int scores2;
        scores2 = 22;
        System.out.println(scores2);

        final int score3 = 20;
        System.out.println(score3);

        System.out.println("mean: "+((scores1+scores2+score3)/3));

        int avgScore = (scores1+scores2+score3)/4;
        String lastName = "Mergency";
        String fullName = name + lastName ;

        System.out.println(fullName+ "'s AVG Score is " + avgScore);


    }
}

package BasicPracticeProblems.doubts;

public class str_ref_dbt {
    public static void main(String[] args) {
        String s1="Manas";
        String s2="Manas";
        System.out.println(s1==s2);
        String s3=new String("Manas");
        String s4=new String("Manas");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s4));
    }
}

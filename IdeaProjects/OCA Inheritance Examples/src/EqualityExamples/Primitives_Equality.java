package EqualityExamples;

import java.util.Date;

public class Primitives_Equality {
    static Date date = new Date(100010001000L);

    static String name1 = "unalo";
    static String name2= new String("unalo");

    public static void names(String name) {
       if (name.equalsIgnoreCase(name1)) {
           System.out.println("find match");
       }
       else {
           System.out.println("are you jas!!");
       }
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
       System.out.println("nantsi " + date.toString());
    }
}

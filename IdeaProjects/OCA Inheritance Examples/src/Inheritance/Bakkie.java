package Inheritance;

public class Bakkie extends Vehicle implements specs {
    Bakkie(String s) {
        super(s);
    }

    public void brand() {
       System.out.println("Navara");
    }
    static void bheki() {
        System.out.println("static");
    }

}
class SmallBakkie extends Bakkie {

    SmallBakkie(String s) {
        super(s);
    }

    public void brand() {
       System.out.println("ranger");
   }
}
class BigBakkie extends Bakkie {
    BigBakkie(String s) {
        super(s);
    }

    void bheki(String s) {
        System.out.println(s);
    }
    public void brand () {
        System.out.println("x-class");
    }
}


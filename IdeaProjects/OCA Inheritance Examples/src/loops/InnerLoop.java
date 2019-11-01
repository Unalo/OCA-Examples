package loops;

public class InnerLoop {
    final int j =0;
   protected int i =0;
    public static void main(String[] args) {
//       protected  int i;
        for (int i = 0; i< 5; i++) {
//            int j=0;
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
            System.out.print("*");
        }
    }
}

package Inheritance;

 interface Bounceable {
    void bounce();
    int getBounceFactor();
}
class GameWithBouncyBall {
    public static void play (Bounceable bounceable) {
        if (bounceable.getBounceFactor() > 3) {
            System.out.println("let's play the Game");
            bounceable.bounce();
        } else {
            System.out.println("This is not a ball");
        }
    }
}

class BeachBall implements Bounceable {
   public void bounce() {
       System.out.println("bounce a cricket ball");
   }
   public int getBounceFactor() {
       return 9;
   }
}
//public class Ball {
//    public static void main(String[] args) {
//         new GameWithBouncyBall().play();
//    }
//}
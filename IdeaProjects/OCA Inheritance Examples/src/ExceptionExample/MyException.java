package ExceptionExample;

import java.util.Scanner;

public class MyException{

   public static void checkFood(String food) throws BadFoodException  {
       if (food.equalsIgnoreCase("Meat") || food.equalsIgnoreCase("Fish")) {
           System.out.println("I like this " + food);
       } else if (food.equalsIgnoreCase("Bread") || food.equalsIgnoreCase("Gatsby")) {
           System.out.println("I hate this food " + food);
       } else {
           System.out.println("I don't eat this !!!! Bitch :-{ , Gimme something nice Haibo");
       }
   }
    public static void main(String[] args) {
       try {
           boolean go = true;
           Scanner takeInput = new Scanner(System.in);
           String foods;
           while (go) {
               System.out.println("ENTER food! ");
               foods = takeInput.nextLine();
               MyException myException = new MyException();
               MyException.checkFood(foods);
               if (foods.equalsIgnoreCase("exit")) {
                   break;
               }
           }
       } catch (BadFoodException ex) {
       }

    }
}

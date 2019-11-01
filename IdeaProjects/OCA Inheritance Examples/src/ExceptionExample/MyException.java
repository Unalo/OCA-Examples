package ExceptionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class MyException{

   public static void checkFood(String food)  {

       ArrayList<String> foods = new ArrayList<>();
       String result = "";
       foods.add("Panini");
       foods.add("Ribs");
       foods.add("Pizza");
       foods.add("Cheese bread");
       foods.add("Samp");
       foods.add("Chicken Mayo");
       foods.add("Sour milk");
       foods.add("Red Meat");
       for (String meal: foods) {
           result = meal;
           System.out.println(meal);
       }
       if (result.equalsIgnoreCase(food)) {
           System.out.println("found one");
       } else {
           System.out.println("");
       }
   }
    public static void main(String[] args) throws Exception {

        boolean go = true;
        Scanner takeInput = new Scanner(System.in);
        String foods;
        while (go) {
            System.out.println("ENTER MEAL! ");
            foods = takeInput.nextLine();
            MyException myException = new MyException();
            MyException.checkFood(foods);
            if (foods.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}

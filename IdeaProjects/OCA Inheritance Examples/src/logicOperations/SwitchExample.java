package logicOperations;

public class SwitchExample {
    public static void main(String[] args) {
        String fruit = "Apple";

        {fruit = "Mango";}

        switch (fruit) {
            default:
                System.out.println("Ayikho");
                break;
            case "apple" :
                System.out.println("iApile");
            case "Mango" :
                System.out.println("Banana");
        }
    }
}

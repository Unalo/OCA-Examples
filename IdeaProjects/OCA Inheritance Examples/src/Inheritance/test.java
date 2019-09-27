package Inheritance;

import ExceptionExample.RuntineExceptions;

public class test {
    public static void main(String[] args) {
//        FamilyCar familyCar = new FamilyCar("MAzda");
//        familyCar.seats();
//        System.out.println("------------------------");
//        BigBakkie bigBakkie = new BigBakkie("4x4");
//        bigBakkie.brand();
//        System.out.println("--------------------------------");
//        SportCar sportCar = new SportCar("rari");
//        sportCar.speed();
//        System.out.println("------------------------------");
//        Bakkie bakkie = new SmallBakkie("marock");
//        bakkie.brand();

//        QuestExample questExample = new QuestExample();
//        questExample.getAge();
        try {
            RuntineExceptions runtineExceptions = new RuntineExceptions();
            runtineExceptions.names();
        } catch (Exception ex) {

        }

    }
}

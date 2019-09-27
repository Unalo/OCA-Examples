package Inheritance;

 public class Vehicle {
     String model;
     int year;
     Vehicle() {

     }
     Vehicle(String s) {
         this.model = s;
         System.out.println(model);
     }
     Vehicle(String u, int num) {
         this.model = u;
         this.year = num;
     }
     void type(String  s) {
         System.out.println(s);
     }
}



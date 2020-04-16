/*
Ricky McKenzie
Lab2 - CSC 1054
*/

public class PersonClient{

public static void main(String [] args){

//Instanciating objects with paramet
   Person p1 = new Person(19, "Lauren", 1001);
   Person p2 = new Person(18, "Matthew", 1002);
   Person p3 = new Person(18, "Matthew", 1002);
   Person p4 = new Person();
   
   
   //using pointers to reference the same memory address for an object with no parameto
   p4 = p3;

          System.out.println(Person.getCountId());
          
          //prints the 3-objects created
                System.out.println(p1.toString());
                System.out.println(p2.toString());
                System.out.println(p3.toString());
               
         //if statement that is testing the == sign
          if(p3 == p4){
               System.out.println("p3 and p4 are =="); 
                     }
         else{
            System.out.println("HA"); 
            }
            
           //if statement that is testing the equals method built to test object equality
            if(p2.equals(p3))
                  System.out.println("p2 and p3 are .equals");
                  else
                     System.out.println("does not equal");
 }
}


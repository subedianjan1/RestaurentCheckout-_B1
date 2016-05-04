/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentcheckout;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Anjan
 */
public class RestaurentCheckout {
    //static String Item = "s";
   
    public static void main(String[] args) {
        List rItemList = new ArrayList();
     
      FoodItem ItemList = new FoodItem(); // object for FoodItem HashMap
      Scanner scan = new Scanner(System.in);
      String Item;
      int Total = 0;
      do {
        System.out.print("Enter the Item or Action:");
        Item = (scan.next().toUpperCase());
        if (Item.equals("CC")||Item.equals("LC")){
            rItemList = ItemList.getFoodValues(Item);
            System.out.println( rItemList.get(0)+":"+ rItemList.get(1) ); 
            Total =  Integer.parseInt( String.valueOf(rItemList.get(1) ) ) + Total;
        }
        else if (Item.equals("T")){
            //use String.valueof to comvert to string
            //as the java expects even if it a string from the object
           // Total =  Integer.parseInt( String.valueOf(rItemList.get(1) ) ) + Total; 
            System.out.println("Total is: " + Total);
        }
            //System.out.println("Total :" Total);
        else
            System.out.println ("Not a valid entry");    
      }
        while (!Item.equals("T"));
    
       
    }// main method
}//Class

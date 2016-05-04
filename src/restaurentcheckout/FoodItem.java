/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentcheckout;
import java.util.*;

/**
 *
 * @author Anjan
 */
public class FoodItem {
    private String s = "food";
    
    
    public FoodItem(){
    }
    
    public List getFoodValues(String FItem) {
        
    ArrayList<String> foodVal_CC = new ArrayList<String>();
    foodVal_CC.addAll(Arrays.asList("Chicken Curry", "15")); 
    ArrayList<String> foodVal_LC = new ArrayList<String>();
    foodVal_LC.addAll(Arrays.asList("Lamb Curry", "18"));
    ArrayList<String> foodVal_CT = new ArrayList<String>();
    foodVal_CT.addAll(Arrays.asList("Chicken Teriyaki","16")); 
    ArrayList<String> foodVal_VC = new ArrayList<String>();
    foodVal_VC.addAll(Arrays.asList("Vegetable  Curry","15"));
    ArrayList<String> foodVal_CR = new ArrayList<String>();
    foodVal_CR.addAll(Arrays.asList("Chicken Roast","19")); 
       
    HashMap<String,List> foodItem = new HashMap <> ();
    foodItem.put("CC", foodVal_CC);
    foodItem.put("LC", foodVal_LC);
    foodItem.put("CT", foodVal_CT);
    foodItem.put("VC", foodVal_VC);
    foodItem.put("CR", foodVal_CR);
    
    switch (FItem){
            case "CC":
                return foodVal_CC;
                
            case "LC":
                return foodVal_LC;
                
            default:
                return foodVal_CC;
    } //switch
    
    } //Method getFoodValues
    

    
}//Class

   





    


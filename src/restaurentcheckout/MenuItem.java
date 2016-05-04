/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentcheckout;

/**
 *implement polymerphism,inheritence,abstract,encapsulation
 * @author Anjan
 */
public class MenuItem {
    private double itemPrice;
    boolean mainORuty;
    String itemSpecial;
    
     
    public void setItemPrice(double iPrice ){
    
    itemPrice = iPrice;
    
}

    public void setItemPrice(double iPrice, boolean iType ){
    
    itemPrice = iPrice;
    mainORuty = iType;
    
}

   public void setItemPrice(double iPrice, boolean iType, String iSpecial ){
    
     itemSpecial = iSpecial;
    
}


}
   


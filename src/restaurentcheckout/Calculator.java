/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentcheckout;

/**
 *
 * @author Anjan
 */
public class Calculator {
  
  public Calculator(){
  }
  
   public int add(int a, int b){
    return (a + b);
  }
  
  	public int subtract(int a, int b){
      return ( a - b);
    }
  
  public int multiply( int a, int b){
    return a * b;
  }
  
   public int devide ( int a , int b) {
    if(b == 0){
        System.out.println("Error! Dividing by zero is not alllowed." );
        return 0;
    }
    else 
     	return a / b;
   }
  
  public int modulo ( int a , int b){
      if (b==0){
        System.out.println("Error! Dividing by zero is not allowed");
        return 0;
      }
      else 
        return(a % b);
      
    }
  
  public static void main ( String[] args){
      Calculator myCalculator = new Calculator(); 
      System.out.println( myCalculator.add(5,7));
      System.out.println( myCalculator.subtract(5,7));
      System.out.println(myCalculator.devide(7,2));
      System.out.println(myCalculator.modulo(6, 0));
      System.out.println(myCalculator.multiply(5, 7));
      
  }
  
}
  
  
  
  
  
  
    
   
    


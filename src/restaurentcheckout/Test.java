/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentcheckout;
import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author Anjan
 */
public class Test {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        String x;
        int i;
      do{
         System.out.print("Enter number");
         x = (scan.next());
         i = Integer.valueOf(x);
         System.out.print(x);
         System.out.print("\n");
      }while( x != "ABC" );
    }
    
}

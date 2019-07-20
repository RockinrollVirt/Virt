/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_class;
import java.util.Scanner;

/**
 *
 * @author Pavlo
 */
class string_test {
    
    static String s = null;
    static    Scanner n = new Scanner(System.in);
    
    public static void masread(){
     s=n.nextLine();
     System.out.println ("Your sentence " +s);
    }
    
    public static void length(){
     System.out.println("Result is "+s.length());
    }
    
    public static void low(){
     System.out.println("Result is "+s.toLowerCase());
    }
    
    public static void up(){
     System.out.println("Result is "+s.toUpperCase());
    }
    
    public static void at(){
     int a;
     System.out.println ("Input number of position ");
     a=n.nextInt();
     System.out.println ("Number of position " +a );
     System.out.println("Result is "+s.charAt(a));
    }
    
    public static void of(){
     String a;
     System.out.println ("Input symbol ");
     a=n.nextLine();
     System.out.println ("Your symbol " +a );
     System.out.println("Result is "+s.indexOf(a));
    }
    
    public static void split(){
     int a;
     System.out.println ("Input count of split ");
     for (String retval : s.split(" ")){
       System.out.println(retval);
     }        
    }
    
    public static void rep(){
     String a;
     String b;
     System.out.println ("Input old symbol ");
     a=n.nextLine();
     System.out.println ("Input new symbol ");
     b=n.nextLine();
     System.out.println("Result is "+s.replace(a,b));
    }
    
    public static void delete(){
        
     String a;
     System.out.println ("Input old symbol ");
     a=n.nextLine();
     System.out.println("Result is "+s.replace(a,""));
//      
//      StringBuilder sb = new StringBuilder(s);
//      System.out.println ("Inputfrom which index ");
//      a=n.nextLine();
//      System.out.println("Result is "+sb.d);
      
      
    }
}

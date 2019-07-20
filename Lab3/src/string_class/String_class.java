
package string_class;
 
import java.util.Scanner;

/**
 *
 * @author Pavlo
 */
public class String_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner n = new Scanner(System.in,"cp866"); 
          System.out.println("Введіть->");
          string_test.masread();
        for(;;){
          System.out.println ("Choose next action:" );
          System.out.println("1. Довжина рядка");
          System.out.println("2. Приводить до нижнього регістру");
          System.out.println("3. Приводить до верхнього регістру");
          System.out.println("4. Відображення символів за позицією");
          System.out.println("5. Відображення позиції символів за назвою");
          System.out.println("6. Відображення всіх слів у реченні");
          System.out.println("7. Знайти підрядок в рядку і замінити на інший"); 
          System.out.println("8. Знайти і видалити рядок");
          int a =  n.nextInt();
            switch (a) {
               
               case 1 :
                    string_test.length();
                   break;
               case 2 :
                    string_test.low();
                    break;
               case 3 :
                    string_test.up();
                    break;
               case 4 :
                    string_test.at();
                    break;
               case 5 :
                    string_test.of();
                    break;
               case 6 :
                    string_test.split();
                    break;
               case 7 :
                    string_test.rep();
                    break;
               case 8 :
                    string_test.delete();
                    break;
            }
        }
    }
}
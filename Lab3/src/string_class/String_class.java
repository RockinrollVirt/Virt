
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
          System.out.println("������->");
          string_test.masread();
        for(;;){
          System.out.println ("Choose next action:" );
          System.out.println("1. ������� �����");
          System.out.println("2. ��������� �� �������� �������");
          System.out.println("3. ��������� �� ��������� �������");
          System.out.println("4. ³���������� ������� �� ��������");
          System.out.println("5. ³���������� ������� ������� �� ������");
          System.out.println("6. ³���������� ��� ��� � ������");
          System.out.println("7. ������ ������� � ����� � ������� �� �����"); 
          System.out.println("8. ������ � �������� �����");
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
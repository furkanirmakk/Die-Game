/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
import java.util.Scanner;

public class UserDiePlayer implements DiePlayer{
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
      
      Scanner s =new Scanner(System.in);
      System.out.println("Roll or Hold?");
      String m = s.nextLine();
      System.out.println("Turn Total: " + turnTotal);

      if(m == "" || m==null){
        return true;
      }
      else{
        return false;
      }
    }
    
  }


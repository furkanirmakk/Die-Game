/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
import java.util.Random;
public class Die{
   
    public int nextRoll(){
        Random r=new Random();
        int x=r.nextInt(5)+1;
        return x;
    }
}
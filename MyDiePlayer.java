/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
public class MyDiePlayer implements DiePlayer{
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
      
        if(maxScore<50 && turnTotal<10){
            return false;
        }
        else{
            return true;
        }
    }   
}
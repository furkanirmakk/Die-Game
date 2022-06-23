/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
public class HoldAt25DiePlayer  implements DiePlayer{
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
    Die k=new Die();
    while(k.nextRoll() != 1){
        if(turnTotal<25){
            if(maxScore<100){
                
                return true;
            }
        } 
    }
    
    return false;
}

}
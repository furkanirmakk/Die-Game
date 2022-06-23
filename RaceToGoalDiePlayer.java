/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
public class RaceToGoalDiePlayer implements DiePlayer {

    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        Die m=new Die();
        if(maxScore >= 71 || myScore >= 71) {
            if(myScore < 100) {
                return true;
            }
            else if(m.nextRoll() == 1){
                return false;
            }
            
        }
        else if (turnTotal >= 21 + Math.round(maxScore - myScore) / 8) {
            return true;
        }
        else if ((turnTotal + myScore) < 100) {
            return true;
        }
        else if(m.nextRoll()==1){
            return false;
        }
        return false;
    }
}
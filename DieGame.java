/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
public class DieGame {
    public static final int GOAL_SCORE = 100;
    private int [] skor;
    DiePlayer[] players;
    int a;
    public DieGame(DiePlayer[] players){
      this.players =players;
      this.a = players.length;
      this.skor= new int[a];
      for (int i=0; i<a; i++){
        this.skor[i]=0;
      }
    }
    int playTurn(DiePlayer p, int playerNum){
      int turskor=0;
      int i=0;
      while(p.isRolling(skor[playerNum],turskor,getMaxScore(),i) != false){
        Die k=new Die();
        if(k.nextRoll() != 1){
          turskor+=k.nextRoll();
          i++;
        }
      } 
      return turskor;
    }
    public int play(){
      while(true){
        for(int i=0; i<a; i++){
          skor[i]=skor[i]+playTurn(players[i],i);
          if(skor[i]>=100){
             return i;
            }
        }
      }
    }
  
    int getMaxScore(){
      int temp=skor[0];
      for(int i=0; i<a; i++){
        if(skor[i]>temp){
          temp=skor[i];
        }
      }
      return temp;
    }
    void printScores(){
      for(int i=0; i<a; i++){
       System.out.println(i + skor[i]);
      }
  
    }
  }
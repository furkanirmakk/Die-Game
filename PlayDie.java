/*BIL122 - project 3
 @furkanrmk Furkan IRMAK, <furkanirmak81@gmail.com>
*/
public class PlayDie{
    public static void main(String[] args){
      DiePlayer[] oyuncu;
      oyuncu[1]=new HoldAt20DiePlayer();
      oyuncu[2]=new HoldAt25DiePlayer();
      oyuncu[3]=new UserDiePlayer();
      int [] skor;
      for(int j=1;j<4;j++){
      DieGame play = new DieGame(oyuncu[j]);
      for(int i =0; i<3; i++){
          int winner = play.play();
        skor[winner]++;
        System.out.println("winner:"+winner);
      }
    }
    }
  }
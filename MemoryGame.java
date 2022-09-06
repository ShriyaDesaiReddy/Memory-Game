package mem;
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;
public class MemoryGame
{
public static void main(String[] args){
 String[]memoryStrings={"a","b","c"};
       MemoryGameGUI game=new MemoryGameGUI();
game.createBoard(3,true);
boolean play=true;
       if(!game.tryExit()){
 play=false;
game.open();
}
int score=0;
       int turn=1;
 while(play){
           Random random=new Random();
           for(int i=0;i<memoryStrings.length;i++){
               int randomIndex=random.nextInt(memoryStrings.length);
               String temp=memoryStrings[randomIndex];
               memoryStrings[randomIndex]=memoryStrings[i];
               memoryStrings[i]=temp;
           }
String guess=game.playSequence(memoryStrings,.5);
           guess=guess.replace(",","");
           guess=guess.replace(" ","");
if(guess.equals(memoryStrings[0]+memoryStrings[1]+memoryStrings[2])){
               game.matched();
               score++;
}else 
           {game.tryAgain();
           }
           game.showScore(score,turn);
           if(!game.playAgain()){
               play=false;
               game.quit();
           }else{
               turn++;
           }
}
 System.out.println("Score "+score);
System.out.println("Turn "+turn);
}}

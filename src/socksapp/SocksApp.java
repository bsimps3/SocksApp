/*

build/run this project to see how many times the socks will match both 
on Wed AND on Fri out of a set number of weeks (numTrials)

Mr. D said the probability should be 1/63, I think this "brute force" method 
agrees with 1/63.

*/
package socksapp;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;

public class SocksApp {

    public static void main(String[] args) {
        
       int numMatches = 0;
       int numTrials = 1000;
       for(int i = 1; i<numTrials +1 ; i++){
          
          Drawer one = new Drawer();
          if(one.getSocksMatchState()){
              numMatches++;
          }
       }
       System.out.println(numMatches);
    }
    
}

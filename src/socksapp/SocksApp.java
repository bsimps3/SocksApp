/*

build/run this project to see how many times the socks will match both 
on Wed AND on Fri out of a set number of weeks (numWeeks)

Mr. D said the probability should be 1/63, I think this "brute force" method 
agrees with 1/63.

 */
package socksapp;

import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;

public class SocksApp {

    public static void main(String[] args) {

        int numWeeks = 1_000_000;
        final int WED1 = 4;
        final int WED2 = 5;
        final int FRI1 = 8;
        final int FRI2 = 9;
        int numMatches = 0;

        for (int i = 1; i < numWeeks + 1; i++) {
            Drawer ob = new Drawer();
            int sock1 = ob.getSock(WED1).getNum();
            int sock2 = ob.getSock(WED2).getNum();
            int sock3 = ob.getSock(FRI1).getNum();
            int sock4 = ob.getSock(FRI2).getNum();
            if (sock1 == sock2 && sock3 == sock4) {
                numMatches++;
            }

        }

        System.out.println(numMatches);

    }
}

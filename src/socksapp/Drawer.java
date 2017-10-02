/*
The drawer holds socks.  First an ArrayList named temp is created which holds socks 
arranged in order:  {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}.

Then a for loop is used to randomly pick an entry in temp to put in an ArrayList named drawer.

The random ordering of the socks in the drawer is the order in which they are pulled out of the drawer.

Element 0 and 1 are pulled out on Monday, 2 & 3 on Tuesday, etc...

*/
package socksapp;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Drawer {
    //The socks are held in an ArrayList named drawer.
    ArrayList temp = new ArrayList(10);
    ArrayList drawer = new ArrayList(10);
    
    public Drawer(){
       
       for(int i = 1; i < 6; i++){
       temp.add(new Sock(i));
       temp.add(new Sock(i));  // Two Sock instances are created with the argument of "i".  These are matching socks.
       
       }
       
       
       
       for(int i = 0; i<10 ; i++){
           
            int randomNum = ThreadLocalRandom.current().nextInt(0, temp.size());
            drawer.add((Sock) temp.get(randomNum));
            //System.out.println(drawer.size());
            temp.remove(randomNum);
           
        }
    }
    //the getSock method allows an instance of the Drawer class to return the sock located at a specific position
    public Sock getSock(int num){
        return (Sock) drawer.get(num);
        
        
    }
    
    }
        

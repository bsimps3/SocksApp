
package socksapp;


import java.util.concurrent.ThreadLocalRandom;

public class Drawer {
    //The socks are held in an array named drawer.
    Sock[] drawer = new Sock[10];
    
    public Drawer(){
       
       Sock[] temp = new Sock[10];
       // The temp[] array holds Sock instances which have an integer 1-5 as their argument.  
       // The number indicates the pair to which the sock belongs.
       // temp[] is setup so that the socks are in order
       
       temp[0]= new Sock(1);
       temp[1]= new Sock(1);
       temp[2]= new Sock(2);
       temp[3]= new Sock(2);
       temp[4]= new Sock(3);
       temp[5]= new Sock(3);
       temp[6]= new Sock(4);
       temp[7]= new Sock(4);
       temp[8]= new Sock(5);
       temp[9]= new Sock(5);
       
       for(int i = 0; i<=9 ; i++){
           //generate a random integer from 0 to 9 and store it in randomNum
            int randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            if(temp[randomNum] != null){
                drawer[i] = temp[randomNum];  //drawer[] is randomized when this for loop finishes
                temp[randomNum] = null;   //once a sock is moved from temp to drawer, delete it from temp
            }
            else{ 
                   i--;  //if the element in temp[] is null, this for loop iteration starts over
            }
        }
    }
        //call this method to see if the socks match on Wed and on Fri
    public boolean getSocksMatchState(){
        int Wed1 = drawer[4].getNum();  //the element at drawer[4] is the first sock picked Wednesday
        int Wed2 = drawer[5].getNum();  //the element at drawer[5] is the second sock picked wednesday
        int Fri1 = drawer[8].getNum();
        int Fri2 = drawer[9].getNum();
        
        if(Wed1 == Wed2 && Fri1 == Fri2){
            return true;
        }
        else{
            return false;
        }
    }
        
}

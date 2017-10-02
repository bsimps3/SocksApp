
// a Sock object gets its "number" when it is created.  The number is passed to the Sock object 
//as the integer of the constructor on line 10 below.
package socksapp;


public class Sock {
    private int pairNum;
    
    public Sock (int num){   //when a Sock is created, an integer is used as the argument of Sock()
        pairNum = num;
    }
    
    public int getNum(){
        return pairNum;
    }
    
  
    
}

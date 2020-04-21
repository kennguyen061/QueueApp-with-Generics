//Zack McGeehan
//Kenny Nguyen
package cpsc2150.MyQueue;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsQueue<T> implements IQueue<T>{

    @Override
    public String toString() {
        String myElement = "";

        for(int i = 1; i <= this.size(); i++){
            myElement += get(i) + ", ";
        }
        myElement += "\n";
        return myElement;
    }
}

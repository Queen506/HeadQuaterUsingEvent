/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingevent2;

import java.util.EventObject;

/**
 *
 * @author ntpsm
 */
public class HeadQuaterEvent extends EventObject {
    private int someData;
    public int getSomeData(){
        return someData;
    }
    public HeadQuaterEvent(Object o,int value) {
        super(o);
        someData = value;
    }
    
}

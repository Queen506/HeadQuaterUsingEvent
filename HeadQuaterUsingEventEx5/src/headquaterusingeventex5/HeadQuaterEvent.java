/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingeventex5;

import java.util.EventObject;

/**
 *
 * @author ntpsm
 */
public class HeadQuaterEvent extends EventObject {
    private String someData;
   

   
    public String getSomeData(){
        return someData;
    }
    public HeadQuaterEvent(Object o,String value) {
        super(o);
        someData = value;
    }
    
}

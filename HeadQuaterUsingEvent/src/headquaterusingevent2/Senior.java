/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingevent2;

/**
 *
 * @author ntpsm
 */
public class Senior implements MyObserver{
    @Override
    public void update(HeadQuaterEvent evt) {
        System.out.println("(Senior) headquater is updateed to " + 
                evt.getSomeData());
    }
}


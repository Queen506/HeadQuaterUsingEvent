/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingevent2;

import java.util.EventListener;

/**
 *
 * @author ntpsm
 */
public interface MyObserver extends EventListener {
    public void update(HeadQuaterEvent evt);
}
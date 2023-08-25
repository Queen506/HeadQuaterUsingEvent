/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingevent2;

import java.util.ArrayList;

/**
 *
 * @author ntpsm
 */
public class Source {
    ArrayList<MyObserver> observers;
    public Source(){
        observers = new ArrayList<>();
    }
    public void addObserver(MyObserver obj){
        observers.add(obj);
    }
     public void setSomeData(int value){
        fireHeadQuaterEvent(new HeadQuaterEvent(this,value));
    }

    public void fireHeadQuaterEvent(HeadQuaterEvent evt) {
        for(MyObserver observer : observers){
            observer.update(evt);
    }
}
}

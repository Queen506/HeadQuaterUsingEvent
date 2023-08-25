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
public class HeadQuaterUsingEvent2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Source source = new Source();
        Senior senior = new Senior();
        Marketing marketing = new Marketing();
        source.addObserver(senior);
        source.addObserver(marketing);
        source.setSomeData(5);
        source.setSomeData(6);
        
        
    }
    
}

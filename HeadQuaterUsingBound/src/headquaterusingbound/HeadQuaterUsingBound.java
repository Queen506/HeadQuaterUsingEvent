/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingbound;

/**
 *
 * @author ntpsm
 */
public class HeadQuaterUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeadQuater headquater = new HeadQuater();
        Senior senior = new Senior();
        Marketing marketing = new Marketing();
        headquater.addPropertyChangeListener(senior);
        headquater.addPropertyChangeListener(marketing);
        headquater.setSomeData(5);
        headquater.setSomeData(6);
    }
    
}

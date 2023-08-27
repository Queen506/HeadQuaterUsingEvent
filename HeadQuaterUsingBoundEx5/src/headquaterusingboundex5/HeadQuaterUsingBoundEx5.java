/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headquaterusingboundex5;

import java.util.Scanner;

/**
 *
 * @author ntpsm
 */
public class HeadQuaterUsingBoundEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HeadQuater headquater = new HeadQuater();
        Senior senior = new Senior();
        Marketing marketing = new Marketing();
        headquater.addPropertyChangeListener(senior);
        headquater.addPropertyChangeListener(marketing);
        //headquater.setSomeData(5);
        //headquater.setSomeData(6);
        
         Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            headquater.setSomeData(input);
        }
    }
    
}

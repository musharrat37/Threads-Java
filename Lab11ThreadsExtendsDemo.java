/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11.threads.extendspackage;

/**
 *
 * @author Dr. Kamruddin Nur
 */
public class Lab11ThreadsExtendsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrameA fa = new FrameA();
        fa.setVisible(true);
        FrameB fb = new FrameB();
        fb.setVisible(true);
        
        CounterA a1 = new CounterA();
        CounterB b1 = new CounterB();
        
        a1.start();
        b1.start();
    }
    
}

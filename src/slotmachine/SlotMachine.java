/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;

/**
 *
 * @author Andonis
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        slotmachine.Model model = new slotmachine.Model();
        slotmachine.ViewController viewController = new slotmachine.ViewController(model);
        viewController.setVisible(true);
    }
    
}

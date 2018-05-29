/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;

import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author Andonis
 */
public class Rolling implements Runnable {

    JLabel Slot1;
    JLabel Slot2;
    JLabel Slot3;
    ViewController parent;
    int numbers[];
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    public Rolling(JLabel label1, JLabel label2, JLabel label3, ViewController parent, int values[]) {
        this.Slot1 = label1;
        this.Slot2 = label2;
        this.Slot3 = label3;
        this.parent = parent;
        this.numbers = values;

    }

    public void run() {
        Slot1.setText("$");
        Slot2.setText("$");
        Slot3.setText("$");
        try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        while (count0 != numbers[0]) {
            count0++;
            Slot1.setText(String.valueOf(count0));
           
            System.out.println(count0);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        while (count1 != numbers[1]) {
            count1++;
            Slot2.setText(String.valueOf(count1));
            
            System.out.println(numbers[1]);
             try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        while (count2 != numbers[2]) {
            count2++;
            Slot3.setText(String.valueOf(count2));
           
            System.out.println(numbers[2]);
             try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        
        parent.rollingDone(numbers);
        
    }

}

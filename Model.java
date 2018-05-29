/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

/**
 *
 * @author Andonis
 */
public class Model {

    int credits = 100;
    int results[] = new int[3];
    String message;
//methods here:

    Model() {

    }

    int[] Spin() {
        this.credits = this.credits - 25;

        for (int i = 0; i < 3; i++) {
            results[i] = ThreadLocalRandom.current().nextInt(0, 101);
            if (results[i] == 1) {
                results[i] = 7;
            } else if (results[i] < 13) {
                results[i] = 1;
            } else if (results[i] < 25) {
                results[i] = 2;
            } else if (results[i] < 37) {
                results[i] = 3;
            } else if (results[i] < 49) {
                results[i] = 4;
            } else if (results[i] < 61) {
                results[i] = 5;
            } else if (results[i] < 74) {
                results[i] = 6;
            } else if (results[i] < 87) {
                results[i] = 8;
            } else {
                results[i] = 9;
            }

        }
        return results;

    }

    void prize(int[] numbers) {
        message = "Aww, try again. Good luck!";
        for (int i = 0; i < 3; i++) {
            if (numbers[i] == 7) {
                credits = credits + 100;
                message = "You got a seven! It's your lucky day!";
            }
        }

        if (numbers[0] == numbers[1]) {
            if (numbers[1] == numbers[2]) {
                this.credits = this.credits + 150;
                message = "Tripple!!! You recieved 150 credits";
            } else {
                this.credits = this.credits + 75;
                message = "Two of a kind! You recieved 75 credits";
            }
        } else if (numbers[1] == numbers[2]) {
            this.credits = this.credits + 75;
            message = "Two of a kind! You recieved 75 credits";
        } else if (numbers[0] == numbers[2]) {
            this.credits = this.credits + 75;
            message = "Two of a kind! You recieved 75 credits";
        }

    }

    void addCredits(int Amount) {
        this.credits = this.credits + Amount;
    }

    String getCredits() {
        return String.valueOf(this.credits);
    }

    int getCreditAmount() {
        return credits;
    }

    String getMessage() {
        return message;
    }

}

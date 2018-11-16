/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Dallas
 */

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        try {
        
            System.out.print("How many numbers do you want to average?");
            
            int count = input.nextInt();
            int sum = 0;
            float average = 0;
            int[] container = new int[count + 1];
            
            System.out.print("Enter " + count + " numbers.");
            
            for(int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + "/" + count);
                container[i] = input.nextInt();
                sum = sum + container[i];
            }

            average = (float)sum / count;
            
            System.out.print("Average: " + average);
            
        } finally {
            input.close();
        }
    }
    
}

/*Write a program to calculate percentage of a given stufent in CBSE board exam.
 * His marks from 5 subjects must be taken as input from the keyboard.
 * (Marks are out of 100).
 * Author: Harsh Upreti 
 */

import java.util.Scanner;

public class CWH_Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0;
        System.out.println("Enter marks");
        for(int i = 0; i < 5; i++)
        {

        System.out.print("Subject "+(i+1)+": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        float percentage = (float)sum / 5;
        System.out.println("Total percentage is");
        System.out.println(percentage);
    }
}

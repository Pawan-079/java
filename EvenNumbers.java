/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mallesh
 */
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range:");
        int start = sc.nextInt();
        System.out.println("Enter end range:");
        int end = sc.nextInt();
        int i;
        for(i=start;i<=end;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}

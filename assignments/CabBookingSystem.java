/*
Create a Java Application for a client which makes easier to book a cab/taxi to
his customers. Your task is to create an application which implements all the 
requirements of the client (No matter that you are implementing all the features or
you are cloning from somewhere).
Methods to be implemented: bookMyCab(), setPickUpLocation(), setDropLocation(),
currentLocation(),getTotalFair(), move() 
Hint: Declare all the mandatory requirements of the client as an interface. 
If you are unable to implement any kind of feature you can take them from
third party vendors(abstract class).

"Your application should be fully implemented with all the requirements of
the client"(normal class). You can add extra methods to make sense to application.
*/
package assignments;

import java.util.*;
import java.io.*;
import java.lang.*;

interface UserRequirements
{
    public void bookMyTaxi(TaxiService ts, int ch);
    public void currentLocation();
    public void setPickUpLocation(float[] pickUp);
    public void setDropLocation(float[] drop);
}
abstract class TaxiService implements UserRequirements
{
    float[] pickUpLoc = new float[2];
    float[] dropLoc = new float[2];
    float[] currLoc = new float[2];
    public void setPickUpLocation(float[] pickUp)
    {
	this.pickUpLoc[0] = pickUp[0];
	this.pickUpLoc[1] = pickUp[1];
	System.out.println("Your pick up location: ("+this.pickUpLoc[0]+","+this.pickUpLoc[1]+")");
    }
    public void setDropLocation(float[] drop)
    {
	this.dropLoc[0] = drop[0];
	this.dropLoc[1] = drop[1];
	System.out.println("Your drop location: ("+this.dropLoc[0]+","+this.dropLoc[1]+")");
    }
    public void currentLocation()
    {
        System.out.println("Current Location: ("+this.currLoc[0]+","+this.currLoc[1]+")");
    }
}
public class CabBookingSystem extends TaxiService
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        TaxiService ts = new CabBookingSystem();
        System.out.println("-: Welcome to TAXI BOOKING SERVICE :-");
        float[] pickUpLoc = new float[2];
        float[] dropLoc = new float[2];

        System.out.println("Set Your Current Location");
	pickUpLoc[0] = read.nextFloat();
	pickUpLoc[1] = read.nextFloat();
        ts.setPickUpLocation(pickUpLoc);

        System.out.println("Set Your Drop Location");
        dropLoc[0] = read.nextFloat();
	dropLoc[1] = read.nextFloat();
        ts.setDropLocation(dropLoc);

        System.out.println("Searching for taxi services near by...");
        for(int i=0;i<10;i++)
        {
            System.out.print(".");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
        System.out.println("\nAvailable taxi services: \n1.Car \n2.Auto \n3.Bike");
        System.out.println("Select your choice: 1 or 2 or 3");
        int choice = read.nextInt();
        ts.bookMyTaxi(ts,choice);
    }
    public void bookMyTaxi(TaxiService ts, int ch)
    {
        switch(ch)
        {
            case 1:
                new CarBookingService(ts);
                break;
            case 2:
                new AutoBookingService(ts);
                break;
            case 3:
                new BikeBookingService(ts);
                break;
            default:
                System.out.println("Please select from available taxi services..");
                break;
        }
    }
}
class CarBookingService extends CabBookingSystem
{
    TaxiService ts;
    public CarBookingService(TaxiService ts)
    {
        this.ts=ts;
        System.out.println("Thanks for choosing Car Booking Service..");
        try{Thread.sleep(2000);} catch(Exception e){}
        Scanner read = new Scanner(System.in);
        while(true)
        {
            System.out.println("select your operation from below:");
            System.out.println("1.Total Fair\n2.Move\n3.Current Location\n4.Exit");
            int ops = read.nextInt();
            if(ops==1)
                this.getTotalFair(ts);
            else if(ops==2)
                this.move(ts, 5);
            else if(ops==3)
                ts.currentLocation();
            else
            {
                System.out.println("Thank You!!");
                break;
            }
        }
    }
    public void getTotalFair(TaxiService ts)
    {
        double distY = Math.pow((ts.dropLoc[1]-ts.pickUpLoc[1]),2);
        double distX = Math.pow((ts.dropLoc[0]-ts.pickUpLoc[0]),2);        
        double totDist = Math.sqrt(distY+distX);
        double totalFair = totDist * 20.00;
        System.out.println("Your total fair: "+ totalFair);
    }
    public void move(TaxiService ts, int n)
    {
        if(ts.currLoc[0] >= ts.dropLoc[0] && ts.currLoc[1] >= ts.dropLoc[1])
            System.out.println("___: Destination Reached :___");
        else
        {
            ts.currLoc[0] = ts.currLoc[0]+n;
            ts.currLoc[1] = ts.currLoc[1]+n;
            System.out.print("Moving "+n+" steps towards destination:");
            for(int i=0;i<n;i++)
            {
                System.out.print(".");
                try{Thread.sleep(500);} catch(Exception e){}
            }
            System.out.println();
        }
    }
}
class AutoBookingService extends CabBookingSystem
{
    TaxiService ts;
    public AutoBookingService(TaxiService ts)
    {
        this.ts=ts;
        System.out.println("Thanks for choosing Auto Booking Service..");
        try{Thread.sleep(2000);} catch(Exception e){}
        Scanner read = new Scanner(System.in);
        while(true)
        {
            System.out.println("select your operation from below:");
            System.out.println("1.Toal Fair\n2.Move\n3.Current Location\n4.exit");
            int ops = read.nextInt();
            if(ops==1)
                this.getTotalFair(ts);
            else if(ops==2)
                this.move(ts, 5);
            else if(ops==3)
                ts.currentLocation();
            else
            {
                System.out.println("Thank You!!");
                break;
            }
        }
    }
    public void getTotalFair(TaxiService ts)
    {
        double distY = Math.pow((ts.dropLoc[1]-ts.pickUpLoc[1]),2);
        double distX = Math.pow((ts.dropLoc[0]-ts.pickUpLoc[0]),2);        
        double totDist = Math.sqrt(distY+distX);
        double totalFair = totDist * 15.00;
        System.out.println("Your total fair: "+ totalFair);
    }
    public void move(TaxiService ts, int n)
    {
        if(ts.currLoc[0] >= ts.dropLoc[0] && ts.currLoc[1] >= ts.dropLoc[1])
            System.out.println("Destination Reached");
        else
        {
            ts.currLoc[0] = ts.currLoc[0]+n;
            ts.currLoc[1] = ts.currLoc[1]+n;
            System.out.println("Moving "+n+" steps towards destination..");
            for(int i=0;i<n;i++)
            {
                System.out.print(".");
                try{Thread.sleep(1500);} catch(Exception e){}
            }
            System.out.println();
        }
    }
}
class BikeBookingService extends CabBookingSystem
{
    TaxiService ts;
    public BikeBookingService(TaxiService ts)
    {
        this.ts=ts;
        System.out.println("Thanks for choosing Bike Booking Service..");
        try{Thread.sleep(2000);} catch(Exception e){}
        Scanner read = new Scanner(System.in);
        while(true)
        {
            System.out.println("select your operation from below:");
            System.out.println("1.Toal Fair\n2.Move\n3.Current Location\n4.exit");
            int ops = read.nextInt();
            if(ops==1)
                this.getTotalFair(ts);
            else if(ops==2)
                this.move(ts, 5);
            else if(ops==3)
                ts.currentLocation();
            else
            {
                System.out.println("Thank You!!");
                break;
            }
        }
    }
    public void getTotalFair(TaxiService ts)
    {
        double distY = Math.pow((ts.dropLoc[1]-ts.pickUpLoc[1]),2);
        double distX = Math.pow((ts.dropLoc[0]-ts.pickUpLoc[0]),2);        
        double totDist = Math.sqrt(distY+distX);
        double totalFair = totDist * 10.00;
        System.out.println("Your total fair: "+ totalFair);
    }
    public void move(TaxiService ts, int n)
    {
        if(ts.currLoc[0] >= ts.dropLoc[0] && ts.currLoc[1] >= ts.dropLoc[1])
            System.out.println("Destination Reached");
        else
        {
            ts.currLoc[0] = ts.currLoc[0]+n;
            ts.currLoc[1] = ts.currLoc[1]+n;
            System.out.println("Moving "+n+" steps towards destination..");
            for(int i=0;i<n;i++)
            {
                System.out.print(".");
                try{Thread.sleep(500);} catch(Exception e){}
            }
            System.out.println();
        }
    }
}
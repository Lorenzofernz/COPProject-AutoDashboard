import java.util.Scanner;
import java.util.Stack;

import javax.lang.model.util.ElementScanner14;
import javax.swing.event.SwingPropertyChangeSupport;

public class FuelGauge {
    
    // input data such as miles driven since last fill up
    //number of gallons of fuel purchased
    //price per gallon

    //calculate and display the driver's avg miles per gallon (MPG) and the cost per mile driven
    //Allow driver to tract their fuel economy and over time display a graph of their MOG and cost per mile driven
    //Allow driver to track their fuel economy and over time display a graph of their MPG and cost per mile driven
     int miles = 0; //miles driven
     int maxMiles = 250; // maximum amount of miles per full tank of gas of avg automobile
     int gallons; // gallons of fuel
     int MPG; //average miles per gallon
     int fullTank = 12; // full tank of fuel for an average automobile 
     int totalMPG = 0;
     
Stack<Integer> trip = new Stack<Integer>();

   public int getMiles(int miles){
    Scanner milesDrivScanner = new Scanner(System.in);
    System.out.println("Enter the number of miles driven since last fill up: ");
    miles = milesDrivScanner.nextInt();
    if(miles < 0){
        System.out.println("Invalid input. Please re-enter miles.");}
        else if(miles >= 1 && miles <= maxMiles){
            return miles;
        }
        else if(miles > maxMiles){
            System.out.println("Invalid input. Vehicle unable to surpass maximum miles in single trip. Please re-enter miles.");
        }
    return miles;
    }
   

    public int getFuel(int gallons) {  //get the current fuel of the vehicle (total gallon minus gallon utilized)
        gallons = fullTank - gallons;

        return gallons;
    }

    public void displayFuel(){ // display the vehicle's current fuel
    System.out.println("Vehicle's current fuel: " + getFuel(MPG));
    }

    public int getMPG(int miles, int gallons) {
        miles = getMiles(miles);
        gallons = getFuel(gallons);
        MPG = miles / gallons;
        return MPG;
    }


public int MPGCalculator(int MPG){  
    Scanner tripScanner = new Scanner(System.in);
    System.out.println("Enter the amount of trips taken: ");
    int trips = tripScanner.nextInt();
    for(int i = 0; i < trips; i++){
        MPG = getMPG(miles, gallons);
        trip.push(MPG);
    }  
while(!trip.isEmpty()){
     totalMPG += trip.pop();
}
    return totalMPG;
    }
    
    public void displayMPG(){
        System.out.println("Vehicle's MPG: " + MPGCalculator(MPG));
    }


}

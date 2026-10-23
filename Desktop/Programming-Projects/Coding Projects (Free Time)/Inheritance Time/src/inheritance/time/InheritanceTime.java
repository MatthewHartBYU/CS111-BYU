/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance.time;

/**
 *
 * @author Matthew
 */
public class InheritanceTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock myClock = new Clock(12,15);
        Clock myStopwatch = new Stopwatch(11,23); 
        System.out.println("Time on clock: " + myClock.displayTime());
        System.out.println("Time on stopwatch: " + myStopwatch.displayTime()); 
          
    }
    
}

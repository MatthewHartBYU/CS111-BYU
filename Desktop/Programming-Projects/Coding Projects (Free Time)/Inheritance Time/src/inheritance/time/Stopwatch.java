/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.time;

/**
 *
 * @author Matthew
 */
public class Stopwatch extends Clock {
   
    public Stopwatch(int hours, int minutes){
        super(hours, minutes); 
    }
    public String displayTime(){
       return super.displayTime() + " - 3 minutes until 4th period!"; 
    }
}

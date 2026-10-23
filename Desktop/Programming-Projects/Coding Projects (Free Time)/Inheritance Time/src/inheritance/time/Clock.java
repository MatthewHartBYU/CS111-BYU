/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.time;

/**
 *
 * @author Matthew
 */
public class Clock {
    private int hours;
    private int minutes;
    public Clock(){
        this.hours = 1;
        this.minutes = 1;
    }
    public Clock(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public String displayTime(){
        if(hours < 12 && minutes < 60){
           return this.hours + ":" + this.minutes + " AM"; 
        }
        else{
            return this.hours + ":" + this.minutes + " PM";
        }
        
    }
    
}

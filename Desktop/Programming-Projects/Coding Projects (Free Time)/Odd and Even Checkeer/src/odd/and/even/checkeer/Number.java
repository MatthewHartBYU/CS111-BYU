/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odd.and.even.checkeer;

/**
 *
 * @author Matthew
 */
public class Number {
    private int value;
    public Number(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value; 
    }
    public boolean isEven(){
        if(this.value % 2 == 0){
            return true;
        }
        return false;
    }
     
}

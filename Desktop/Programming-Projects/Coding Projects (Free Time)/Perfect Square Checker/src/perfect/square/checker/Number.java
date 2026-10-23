/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perfect.square.checker;

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
    public boolean isPerfectSquare(){
        return Math.sqrt(this.value) - Math.floor(Math.sqrt(this.value)) == 0; 
    }
}

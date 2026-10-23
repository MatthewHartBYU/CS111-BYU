/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Matthew
 */
public class Student {
    public String name;
    public String grade; 
    public Student(String name, String grade){
        this.name = name;
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public String getGrade(){
        return this.grade;
    }
}
